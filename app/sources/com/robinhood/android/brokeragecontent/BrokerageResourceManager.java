package com.robinhood.android.brokeragecontent;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BrokerageResourceManager.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eJ&\u0010\u000f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0086@¢\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0000\u0010\u0013*\u00020\f*\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0096\u0001J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0000\u0010\u0013*\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0096\u0001J?\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c¢\u0006\u0002\b H\u0096\u0001¢\u0006\u0002\u0010!JS\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00130#\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u001a2)\u0010\u001b\u001a%\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00130\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c¢\u0006\u0002\b H\u0096\u0001¢\u0006\u0002\u0010$JW\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0000\u0010\u0013*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2/\b\u0001\u0010\u001b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c¢\u0006\u0002\b H\u0096\u0001¢\u0006\u0002\u0010'JO\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00130\n\"\b\b\u0000\u0010\u0013*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c¢\u0006\u0002\b H\u0096\u0001¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "Lcom/robinhood/coroutines/rx/RxFactory;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", "loadResource", "Lio/reactivex/Single;", "R", "", "brokerageResource", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "loadResourceSuspend", "(Lcom/robinhood/android/brokeragecontent/BrokerageResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asObservable", "Lio/reactivex/Observable;", "T", "Lkotlinx/coroutines/flow/Flow;", "convertToObservable", "flow", "rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "rxSingle", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BrokerageResourceManager implements RxFactory {
    private final /* synthetic */ RxFactory $$delegate_0;
    private final StaticContentStore staticContentStore;
    private final UserStore userStore;

    /* compiled from: BrokerageResourceManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.brokeragecontent.BrokerageResourceManager", m3645f = "BrokerageResourceManager.kt", m3646l = {37, 33}, m3647m = "loadResourceSuspend")
    /* renamed from: com.robinhood.android.brokeragecontent.BrokerageResourceManager$loadResourceSuspend$1 */
    static final class C99221<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C99221(Continuation<? super C99221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrokerageResourceManager.this.loadResourceSuspend(null, this);
        }
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return this.$$delegate_0.asObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return this.$$delegate_0.convertToObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxCompletable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxMaybe(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxObservable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.$$delegate_0.rxSingle(context, block);
    }

    public BrokerageResourceManager(StaticContentStore staticContentStore, UserStore userStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.$$delegate_0 = rxFactory;
        this.staticContentStore = staticContentStore;
        this.userStore = userStore;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: BrokerageResourceManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "R", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.brokeragecontent.BrokerageResourceManager$loadResource$1", m3645f = "BrokerageResourceManager.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.brokeragecontent.BrokerageResourceManager$loadResource$1 */
    static final class C99211<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ BrokerageResource<R> $brokerageResource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C99211(BrokerageResource<? extends R> brokerageResource, Continuation<? super C99211> continuation) {
            super(2, continuation);
            this.$brokerageResource = brokerageResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BrokerageResourceManager.this.new C99211(this.$brokerageResource, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C99211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BrokerageResourceManager brokerageResourceManager = BrokerageResourceManager.this;
            BrokerageResource<R> brokerageResource = this.$brokerageResource;
            this.label = 1;
            Object objLoadResourceSuspend = brokerageResourceManager.loadResourceSuspend(brokerageResource, this);
            return objLoadResourceSuspend == coroutine_suspended ? coroutine_suspended : objLoadResourceSuspend;
        }
    }

    public final <R> Single<R> loadResource(BrokerageResource<? extends R> brokerageResource) {
        Intrinsics.checkNotNullParameter(brokerageResource, "brokerageResource");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C99211(brokerageResource, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object loadResourceSuspend(BrokerageResource<? extends R> brokerageResource, Continuation<? super R> continuation) {
        C99221 c99221;
        if (continuation instanceof C99221) {
            c99221 = (C99221) continuation;
            int i = c99221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c99221.label = i - Integer.MIN_VALUE;
            } else {
                c99221 = new C99221(continuation);
            }
        }
        C99221 c992212 = c99221;
        Object objAwaitFirst = c992212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c992212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable<User> user = this.userStore.getUser();
            c992212.L$0 = brokerageResource;
            c992212.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(user, c992212);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirst);
            return ((EntryResource) objAwaitFirst).getValue();
        }
        brokerageResource = (BrokerageResource) c992212.L$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        String contentfulId = BrokerageResource2.getContentfulId(brokerageResource, ((User) objAwaitFirst).getOrigin().getLocality());
        StaticContentStore staticContentStore = this.staticContentStore;
        c992212.L$0 = null;
        c992212.label = 2;
        objAwaitFirst = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, c992212, 2, null);
    }
}
