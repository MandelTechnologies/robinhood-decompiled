package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.conversations.RxErrorExtensions;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import rosetta.postoffice.PostOfficeGrpc;
import rosetta.postoffice.SawBadgeRequestDto;
import rosetta.postoffice.SawBadgeResponseDto;
import rosetta.postoffice.ShouldBadgeResponseDto;

/* compiled from: InboxBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018J\u0006\u0010\u001b\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "Lcom/robinhood/store/Store;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "postOfficeService", "Lrosetta/postoffice/PostOfficeGrpc;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/supportchat/SupportChatStore;Lrosetta/postoffice/PostOfficeGrpc;Lcom/robinhood/store/StoreBundle;)V", "value", "Lcom/robinhood/models/db/InboxBadge;", "latestBadgeResult", "getLatestBadgeResult", "()Lcom/robinhood/models/db/InboxBadge;", "shouldBadgeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "shouldBadgeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lrosetta/postoffice/ShouldBadgeResponseDto;", "shouldBadgeQuery", "Lcom/robinhood/android/moria/db/Query;", "streamHasUnreadChatMessage", "Lio/reactivex/Observable;", "", "streamBadgeResult", "refreshBadgeResult", "postSawBadge", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshChatBadge", "Lkotlinx/coroutines/Job;", "lib-store-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InboxBadgeStore extends Store {
    private InboxBadge latestBadgeResult;
    private final PostOfficeGrpc postOfficeService;
    private final Endpoint<Unit, ShouldBadgeResponseDto> shouldBadgeEndpoint;
    private final Query<Unit, InboxBadge> shouldBadgeQuery;
    private final BehaviorRelay<InboxBadge> shouldBadgeRelay;
    private final SupportChatStore supportChatStore;

    /* compiled from: InboxBadgeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxBadgeStore", m3645f = "InboxBadgeStore.kt", m3646l = {106}, m3647m = "postSawBadge")
    /* renamed from: com.robinhood.librobinhood.data.store.InboxBadgeStore$postSawBadge$1 */
    static final class C338831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C338831(Continuation<? super C338831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboxBadgeStore.this.postSawBadge(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxBadgeStore(SupportChatStore supportChatStore, PostOfficeGrpc postOfficeService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(postOfficeService, "postOfficeService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.supportChatStore = supportChatStore;
        this.postOfficeService = postOfficeService;
        BehaviorRelay<InboxBadge> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new InboxBadge(false, false));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.shouldBadgeRelay = behaviorRelayCreateDefault;
        this.shouldBadgeEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InboxBadgeStore2(this, null), getLogoutKillswitch(), new InboxBadgeStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.shouldBadgeQuery = Store.create$default(this, Query.INSTANCE, "shouldBadgeQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxBadgeStore.shouldBadgeQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxBadgeStore.shouldBadgeQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    public final InboxBadge getLatestBadgeResult() {
        return this.latestBadgeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow shouldBadgeQuery$lambda$0(InboxBadgeStore inboxBadgeStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(inboxBadgeStore.shouldBadgeEndpoint, Unit.INSTANCE, Durations.INSTANCE.getFIVE_SECONDS(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow shouldBadgeQuery$lambda$1(InboxBadgeStore inboxBadgeStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Observable<InboxBadge> observableHide = inboxBadgeStore.shouldBadgeRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableHide), Integer.MAX_VALUE, null, 2, null);
    }

    public final Observable<Boolean> streamHasUnreadChatMessage() {
        Observable map = asObservable(this.supportChatStore.streamUnreadMessageCount()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore.streamHasUnreadChatMessage.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.longValue() > 0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<Boolean> observableStartWith = RxErrorExtensions.ignoreChatException(map).retryWhen(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore.streamHasUnreadChatMessage.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Throwable> errorStream) {
                Intrinsics.checkNotNullParameter(errorStream, "errorStream");
                return errorStream.flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore.streamHasUnreadChatMessage.2.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends Long> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Observable.timer(3000L, TimeUnit.MILLISECONDS);
                    }
                });
            }
        }).startWith((Observable) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        return observableStartWith;
    }

    public final Observable<InboxBadge> streamBadgeResult() {
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.shouldBadgeQuery.asObservable(Unit.INSTANCE), streamHasUnreadChatMessage(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore$streamBadgeResult$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                InboxBadge inboxBadge = (InboxBadge) t1;
                boolean z = true;
                boolean z2 = inboxBadge.getResult() || zBooleanValue;
                if (!inboxBadge.getShouldCriticalBadge() && !zBooleanValue) {
                    z = false;
                }
                return (R) new InboxBadge(z2, z);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<InboxBadge> observableDoOnNext = observableCombineLatest.doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.InboxBadgeStore.streamBadgeResult.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(InboxBadge inboxBadge) {
                InboxBadgeStore.this.latestBadgeResult = inboxBadge;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    public final void refreshBadgeResult() {
        Endpoint.DefaultImpls.refresh$default(this.shouldBadgeEndpoint, Unit.INSTANCE, true, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postSawBadge(Continuation<? super Boolean> continuation) {
        C338831 c338831;
        boolean should_badge;
        if (continuation instanceof C338831) {
            c338831 = (C338831) continuation;
            int i = c338831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338831.label = i - Integer.MIN_VALUE;
            } else {
                c338831 = new C338831(continuation);
            }
        }
        Object objSawBadge = c338831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338831.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSawBadge);
                PostOfficeGrpc postOfficeGrpc = this.postOfficeService;
                SawBadgeRequestDto sawBadgeRequestDto = new SawBadgeRequestDto(null, i3, 0 == true ? 1 : 0);
                c338831.label = 1;
                objSawBadge = postOfficeGrpc.SawBadge(sawBadgeRequestDto, c338831);
                if (objSawBadge == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSawBadge);
            }
            should_badge = ((SawBadgeResponseDto) objSawBadge).getShould_badge();
        } catch (Exception unused) {
            should_badge = false;
        }
        return boxing.boxBoolean(should_badge);
    }

    /* compiled from: InboxBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxBadgeStore$refreshChatBadge$1", m3645f = "InboxBadgeStore.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.InboxBadgeStore$refreshChatBadge$1 */
    static final class C338841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338841(Continuation<? super C338841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InboxBadgeStore.this.new C338841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!InboxBadgeStore.this.supportChatStore.hasAnyActiveSupportChat()) {
                    SupportChatStore supportChatStore = InboxBadgeStore.this.supportChatStore;
                    this.label = 1;
                    if (supportChatStore.refreshSupportChatList(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public final Job refreshChatBadge() {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C338841(null), 3, null);
    }
}
