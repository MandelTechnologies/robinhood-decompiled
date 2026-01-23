package com.robinhood.android.feature.margin.hub.deficit;

import com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.models.api.ApiBuyingPowerBreakdown;
import com.robinhood.models.api.DeficitReason;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CheckBuyingPowerDeficitDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0015H\u0002J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0015H\u0002J\f\u0010\u0019\u001a\u00020\u0017*\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerViewState;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "retryLoadingBuyingPowerBreakdown", "loadBuyingPowerBreakdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitNavigationDestinationEvent", "accountNumber", "", "buyingPowerBreakdown", "Lcom/robinhood/models/api/ApiBuyingPowerBreakdown;", "isInRhdMarginCall", "", "isDeficitRelatedToOptions", "isAccountInDeficit", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckBuyingPowerDeficitDuxo extends BaseDuxo5<CheckBuyingPowerViewState, CheckBuyingPowerDeficitDuxo2> {
    private final AccountStore accountStore;
    private final Brokeback brokeback;
    public static final int $stable = 8;
    private static final Set<DeficitReason> rhdMarginDeficitReasons = SetsKt.setOf((Object[]) new DeficitReason[]{DeficitReason.MULTIPLE_OPEN, DeficitReason.MULTIPLE_MAINTAIN, DeficitReason.RHD_OPEN, DeficitReason.RHD_MAINTAIN});
    private static final Set<DeficitReason> optionsDeficitReasons = SetsKt.setOf((Object[]) new DeficitReason[]{DeficitReason.EARLY_ASSIGNMENT, DeficitReason.PENDING_OPTIONS_EVENTS, DeficitReason.RECENT_OPTIONS_EVENT});

    /* compiled from: CheckBuyingPowerDeficitDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo", m3645f = "CheckBuyingPowerDeficitDuxo.kt", m3646l = {116, 44}, m3647m = "loadBuyingPowerBreakdown")
    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$loadBuyingPowerBreakdown$1 */
    static final class C168441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C168441(Continuation<? super C168441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CheckBuyingPowerDeficitDuxo.this.loadBuyingPowerBreakdown(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckBuyingPowerDeficitDuxo(AccountStore accountStore, Brokeback brokeback, DuxoBundle duxoBundle) {
        super(new CheckBuyingPowerViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountStore = accountStore;
        this.brokeback = brokeback;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C168461(null));
    }

    /* compiled from: CheckBuyingPowerDeficitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$onCreate$1", m3645f = "CheckBuyingPowerDeficitDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$onCreate$1 */
    static final class C168461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168461(Continuation<? super C168461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckBuyingPowerDeficitDuxo.this.new C168461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CheckBuyingPowerDeficitDuxo checkBuyingPowerDeficitDuxo = CheckBuyingPowerDeficitDuxo.this;
                this.label = 1;
                if (checkBuyingPowerDeficitDuxo.loadBuyingPowerBreakdown(this) == coroutine_suspended) {
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

    /* compiled from: CheckBuyingPowerDeficitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$retryLoadingBuyingPowerBreakdown$1", m3645f = "CheckBuyingPowerDeficitDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$retryLoadingBuyingPowerBreakdown$1 */
    static final class C168471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168471(Continuation<? super C168471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckBuyingPowerDeficitDuxo.this.new C168471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CheckBuyingPowerDeficitDuxo checkBuyingPowerDeficitDuxo = CheckBuyingPowerDeficitDuxo.this;
                this.label = 1;
                if (checkBuyingPowerDeficitDuxo.loadBuyingPowerBreakdown(this) == coroutine_suspended) {
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

    public final void retryLoadingBuyingPowerBreakdown() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C168471(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadBuyingPowerBreakdown(Continuation<? super Unit> continuation) throws Throwable {
        C168441 c168441;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        CheckBuyingPowerDeficitDuxo checkBuyingPowerDeficitDuxo;
        ApiBuyingPowerBreakdown apiBuyingPowerBreakdown;
        String str;
        CheckBuyingPowerDeficitDuxo checkBuyingPowerDeficitDuxo2;
        if (continuation instanceof C168441) {
            c168441 = (C168441) continuation;
            int i = c168441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c168441.label = i - Integer.MIN_VALUE;
            } else {
                c168441 = new C168441(continuation);
            }
        }
        Object objAwait = c168441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c168441.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Result.Companion companion2 = Result.INSTANCE;
            Single<Optional<String>> individualAccountNumber = this.accountStore.getIndividualAccountNumber();
            c168441.L$0 = this;
            c168441.label = 1;
            objAwait = RxAwait3.await(individualAccountNumber, c168441);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            checkBuyingPowerDeficitDuxo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c168441.L$1;
                checkBuyingPowerDeficitDuxo2 = (CheckBuyingPowerDeficitDuxo) c168441.L$0;
                ResultKt.throwOnFailure(objAwait);
                apiBuyingPowerBreakdown = (ApiBuyingPowerBreakdown) objAwait;
                checkBuyingPowerDeficitDuxo2.submitNavigationDestinationEvent(str, apiBuyingPowerBreakdown);
                objM28550constructorimpl = Result.m28550constructorimpl(apiBuyingPowerBreakdown);
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
                }
                applyMutation(new C168452(objM28550constructorimpl, null));
                return Unit.INSTANCE;
            }
            checkBuyingPowerDeficitDuxo = (CheckBuyingPowerDeficitDuxo) c168441.L$0;
            ResultKt.throwOnFailure(objAwait);
        }
        String str2 = (String) ((Optional) objAwait).getOrNull();
        if (str2 == null) {
            apiBuyingPowerBreakdown = null;
            objM28550constructorimpl = Result.m28550constructorimpl(apiBuyingPowerBreakdown);
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
            applyMutation(new C168452(objM28550constructorimpl, null));
            return Unit.INSTANCE;
        }
        Brokeback brokeback = checkBuyingPowerDeficitDuxo.brokeback;
        c168441.L$0 = checkBuyingPowerDeficitDuxo;
        c168441.L$1 = str2;
        c168441.label = 2;
        Object buyingPowerBreakdown = brokeback.getBuyingPowerBreakdown(str2, c168441);
        if (buyingPowerBreakdown != coroutine_suspended) {
            str = str2;
            objAwait = buyingPowerBreakdown;
            checkBuyingPowerDeficitDuxo2 = checkBuyingPowerDeficitDuxo;
            apiBuyingPowerBreakdown = (ApiBuyingPowerBreakdown) objAwait;
            checkBuyingPowerDeficitDuxo2.submitNavigationDestinationEvent(str, apiBuyingPowerBreakdown);
            objM28550constructorimpl = Result.m28550constructorimpl(apiBuyingPowerBreakdown);
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
            applyMutation(new C168452(objM28550constructorimpl, null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: CheckBuyingPowerDeficitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$loadBuyingPowerBreakdown$2", m3645f = "CheckBuyingPowerDeficitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo$loadBuyingPowerBreakdown$2 */
    static final class C168452 extends ContinuationImpl7 implements Function2<CheckBuyingPowerViewState, Continuation<? super CheckBuyingPowerViewState>, Object> {
        final /* synthetic */ Object $buyingPowerBreakdown;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C168452(Object obj, Continuation<? super C168452> continuation) {
            super(2, continuation);
            this.$buyingPowerBreakdown = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C168452 c168452 = new C168452(this.$buyingPowerBreakdown, continuation);
            c168452.L$0 = obj;
            return c168452;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckBuyingPowerViewState checkBuyingPowerViewState, Continuation<? super CheckBuyingPowerViewState> continuation) {
            return ((C168452) create(checkBuyingPowerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CheckBuyingPowerViewState) this.L$0).copy(Result.m28549boximpl(this.$buyingPowerBreakdown));
        }
    }

    private final void submitNavigationDestinationEvent(String accountNumber, ApiBuyingPowerBreakdown buyingPowerBreakdown) {
        submit(new CheckBuyingPowerDeficitDuxo2.NavigateToDestination(accountNumber, isAccountInDeficit(buyingPowerBreakdown) && !isDeficitRelatedToOptions(buyingPowerBreakdown) && isInRhdMarginCall(buyingPowerBreakdown)));
    }

    private final boolean isInRhdMarginCall(ApiBuyingPowerBreakdown apiBuyingPowerBreakdown) {
        List<ApiBuyingPowerBreakdown.Explanation> explanation = apiBuyingPowerBreakdown.getExplanation();
        if (explanation != null) {
            List<ApiBuyingPowerBreakdown.Explanation> list = explanation;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (rhdMarginDeficitReasons.contains(((ApiBuyingPowerBreakdown.Explanation) it.next()).getReason())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isDeficitRelatedToOptions(ApiBuyingPowerBreakdown apiBuyingPowerBreakdown) {
        List<ApiBuyingPowerBreakdown.Explanation> explanation = apiBuyingPowerBreakdown.getExplanation();
        if (explanation != null) {
            List<ApiBuyingPowerBreakdown.Explanation> list = explanation;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (optionsDeficitReasons.contains(((ApiBuyingPowerBreakdown.Explanation) it.next()).getReason())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isAccountInDeficit(ApiBuyingPowerBreakdown apiBuyingPowerBreakdown) {
        return apiBuyingPowerBreakdown.getDeficit().compareTo(BigDecimal.ZERO) > 0;
    }
}
