package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore2;
import com.robinhood.models.api.ApiHasRecentRejection;
import com.robinhood.models.api.ApiOptionDowngradeRequest;
import com.robinhood.models.api.ApiOptionDowngradeRequest2;
import com.robinhood.models.api.ApiOptionLevelChange;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
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
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.HttpException;

/* compiled from: OptionUpgradeStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JX\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u001820\b\u0002\u0010\u0019\u001a*\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u001aJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/api/options/retrofit/OptionsApi;)V", "changeOptionLevel", "Lcom/robinhood/models/api/ApiOptionLevelChange;", "accountNumber", "", "optionLevel", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downgradeOptionLevel", "Lio/reactivex/Observable;", "", "downgradeRequest", "Lcom/robinhood/models/api/ApiOptionDowngradeRequest;", "changeOptionLevelForResult", "Lcom/robinhood/librobinhood/data/store/ChangeOptionLevelResult;", "isDowngrade", "", "sendChangeLevelRequestWithSuvHandler", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lio/reactivex/Single;", "hasRecentRejection", "Lkotlinx/coroutines/flow/Flow;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionUpgradeStore extends Store {
    private final AccountProvider accountProvider;
    private final OptionsApi optionsApi;

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradeStore", m3645f = "OptionUpgradeStore.kt", m3646l = {32}, m3647m = "changeOptionLevel")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradeStore$changeOptionLevel$1 */
    static final class C341591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C341591(Continuation<? super C341591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionUpgradeStore.this.changeOptionLevel(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionUpgradeStore(StoreBundle storeBundle, AccountProvider accountProvider, OptionsApi optionsApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        this.accountProvider = accountProvider;
        this.optionsApi = optionsApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeOptionLevel(String str, String str2, Continuation<? super ApiOptionLevelChange> continuation) {
        C341591 c341591;
        if (continuation instanceof C341591) {
            c341591 = (C341591) continuation;
            int i = c341591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c341591.label = i - Integer.MIN_VALUE;
            } else {
                c341591 = new C341591(continuation);
            }
        }
        Object objChangeOptionLevel = c341591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c341591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objChangeOptionLevel);
            OptionsApi optionsApi = this.optionsApi;
            ApiOptionLevelChange.Request request = new ApiOptionLevelChange.Request(Account.INSTANCE.getUrl(str), str2);
            c341591.label = 1;
            objChangeOptionLevel = optionsApi.changeOptionLevel(request, c341591);
            if (objChangeOptionLevel == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objChangeOptionLevel);
        }
        this.accountProvider.refresh(true);
        return objChangeOptionLevel;
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradeStore$downgradeOptionLevel$1", m3645f = "OptionUpgradeStore.kt", m3646l = {41, 40}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradeStore$downgradeOptionLevel$1 */
    static final class C341631 extends ContinuationImpl7 implements Function2<Produce4<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiOptionDowngradeRequest $downgradeRequest;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341631(ApiOptionDowngradeRequest apiOptionDowngradeRequest, Continuation<? super C341631> continuation) {
            super(2, continuation);
            this.$downgradeRequest = apiOptionDowngradeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341631 c341631 = OptionUpgradeStore.this.new C341631(this.$downgradeRequest, continuation);
            c341631.L$0 = obj;
            return c341631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Unit> produce4, Continuation<? super Unit> continuation) {
            return ((C341631) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (r1.send(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                OptionsApi optionsApi = OptionUpgradeStore.this.optionsApi;
                ApiOptionDowngradeRequest apiOptionDowngradeRequest = this.$downgradeRequest;
                this.L$0 = produce4;
                this.label = 1;
                if (optionsApi.downgradeOptionLevel(apiOptionDowngradeRequest, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            OptionUpgradeStore.this.accountProvider.refresh(true);
            Unit unit2 = Unit.INSTANCE;
            this.L$0 = null;
            this.label = 2;
        }
    }

    private final Observable<Unit> downgradeOptionLevel(ApiOptionDowngradeRequest downgradeRequest) {
        return RxFactory.DefaultImpls.rxObservable$default(this, null, new C341631(downgradeRequest, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Observable changeOptionLevelForResult$default(final OptionUpgradeStore optionUpgradeStore, String str, String str2, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradeStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionUpgradeStore.changeOptionLevelForResult$lambda$1(this.f$0, (Function1) obj2);
                }
            };
        }
        return optionUpgradeStore.changeOptionLevelForResult(str, str2, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single changeOptionLevelForResult$lambda$1(OptionUpgradeStore optionUpgradeStore, Function1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(optionUpgradeStore, null, new OptionUpgradeStore3(request, null), 1, null);
    }

    public final Observable<OptionUpgradeStore2> changeOptionLevelForResult(final String accountNumber, final String optionLevel, boolean isDowngrade, Function1<? super Function1<? super Continuation<? super ApiOptionLevelChange>, ? extends Object>, ? extends Single<ApiOptionLevelChange>> sendChangeLevelRequestWithSuvHandler) {
        Observable<Unit> observable;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sendChangeLevelRequestWithSuvHandler, "sendChangeLevelRequestWithSuvHandler");
        if (isDowngrade) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            observable = downgradeOptionLevel(new ApiOptionDowngradeRequest(accountNumber, uuidRandomUUID, ApiOptionDowngradeRequest2.INSTANCE.fromOptionLevelString(optionLevel)));
        } else {
            observable = sendChangeLevelRequestWithSuvHandler.invoke(new C341602(accountNumber, optionLevel, null)).toObservable();
        }
        Observable<OptionUpgradeStore2> observableOnErrorReturn = observable.flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradeStore.changeOptionLevelForResult.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionUpgradeStore2> apply(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AccountProvider accountProvider = OptionUpgradeStore.this.accountProvider;
                String str = accountNumber;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Observable<Account> observableOnErrorResumeNext = accountProvider.pollAccount(str, 1L, timeUnit).onErrorResumeNext(Observable.empty());
                final String str2 = optionLevel;
                Observable<Account> observableTakeLast = observableOnErrorResumeNext.takeUntil(new Predicate() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradeStore.changeOptionLevelForResult.3.1
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Account account) {
                        Intrinsics.checkNotNullParameter(account, "account");
                        return Intrinsics.areEqual(account.getOptionLevel(), str2);
                    }
                }).take(10L, timeUnit).takeLast(1);
                final String str3 = optionLevel;
                return observableTakeLast.map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradeStore.changeOptionLevelForResult.3.2
                    @Override // io.reactivex.functions.Function
                    public final OptionUpgradeStore2 apply(Account account) {
                        Intrinsics.checkNotNullParameter(account, "account");
                        if (Intrinsics.areEqual(account.getOptionLevel(), str3)) {
                            return new OptionUpgradeStore2.Success(str3);
                        }
                        return new OptionUpgradeStore2.Pending(str3);
                    }
                }).defaultIfEmpty(new OptionUpgradeStore2.Pending(optionLevel));
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionUpgradeStore.changeOptionLevelForResult.4
            @Override // io.reactivex.functions.Function
            public final OptionUpgradeStore2 apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return new OptionUpgradeStore2.Failure(optionLevel, t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        return observableOnErrorReturn;
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionLevelChange;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradeStore$changeOptionLevelForResult$2", m3645f = "OptionUpgradeStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradeStore$changeOptionLevelForResult$2 */
    static final class C341602 extends ContinuationImpl7 implements Function1<Continuation<? super ApiOptionLevelChange>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $optionLevel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341602(String str, String str2, Continuation<? super C341602> continuation) {
            super(1, continuation);
            this.$accountNumber = str;
            this.$optionLevel = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return OptionUpgradeStore.this.new C341602(this.$accountNumber, this.$optionLevel, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ApiOptionLevelChange> continuation) {
            return ((C341602) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            OptionUpgradeStore optionUpgradeStore = OptionUpgradeStore.this;
            String str = this.$accountNumber;
            String str2 = this.$optionLevel;
            this.label = 1;
            Object objChangeOptionLevel = optionUpgradeStore.changeOptionLevel(str, str2, this);
            return objChangeOptionLevel == coroutine_suspended ? coroutine_suspended : objChangeOptionLevel;
        }
    }

    /* compiled from: OptionUpgradeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradeStore$hasRecentRejection$1", m3645f = "OptionUpgradeStore.kt", m3646l = {101, 101, 109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradeStore$hasRecentRejection$1 */
    static final class C341641 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341641(String str, Continuation<? super C341641> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341641 c341641 = OptionUpgradeStore.this.new C341641(this.$accountNumber, continuation);
            c341641.L$0 = obj;
            return c341641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C341641) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        
            if (r0.emit(r9, r8) != r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        
            if (r4.emit(r9, r8) != r1) goto L8;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                try {
                    OptionsApi optionsApi = OptionUpgradeStore.this.optionsApi;
                    String str = this.$accountNumber;
                    this.L$0 = flowCollector4;
                    this.L$1 = flowCollector4;
                    this.label = 1;
                    Object objHasRecentRejection = optionsApi.hasRecentRejection(str, this);
                    if (objHasRecentRejection != coroutine_suspended) {
                        flowCollector2 = flowCollector4;
                        obj = objHasRecentRejection;
                        flowCollector3 = flowCollector2;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((ApiHasRecentRejection) obj).getRecent_rejection_exists());
                        this.L$0 = flowCollector2;
                        this.L$1 = null;
                        this.label = 2;
                    }
                } catch (HttpException e) {
                    e = e;
                    flowCollector = flowCollector4;
                    Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
                    this.L$0 = e;
                    this.L$1 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector3 = (FlowCollector) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Boolean boolBoxBoolean3 = boxing.boxBoolean(((ApiHasRecentRejection) obj).getRecent_rejection_exists());
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 2;
                } catch (HttpException e2) {
                    e = e2;
                    flowCollector = flowCollector2;
                    Boolean boolBoxBoolean22 = boxing.boxBoolean(false);
                    this.L$0 = e;
                    this.L$1 = null;
                    this.label = 3;
                }
            } else if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (HttpException e3) {
                    e = e3;
                    Boolean boolBoxBoolean222 = boxing.boxBoolean(false);
                    this.L$0 = e;
                    this.L$1 = null;
                    this.label = 3;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = (HttpException) this.L$0;
                ResultKt.throwOnFailure(obj);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Boolean> hasRecentRejection(String accountNumber) {
        return FlowKt.flow(new C341641(accountNumber, null));
    }
}
