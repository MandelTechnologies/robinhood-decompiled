package com.robinhood.android.p273ui.appbar;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.models.p320db.InboxBadge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: WatchlistHomeAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/ui/appbar/WatchlistHomeAppBarDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/ui/appbar/WatchlistHomeAppBarViewState;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "streamInboxBadge", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WatchlistHomeAppBarDuxo extends BaseDuxo4<WatchlistHomeAppBarViewState> {
    public static final int $stable = 8;
    private final InboxBadgeStore inboxBadgeStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistHomeAppBarDuxo(InboxBadgeStore inboxBadgeStore, DuxoBundle duxoBundle) {
        super(new WatchlistHomeAppBarViewState(false, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.inboxBadgeStore = inboxBadgeStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C313181(null));
    }

    /* compiled from: WatchlistHomeAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$onCreate$1", m3645f = "WatchlistHomeAppBarDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$onCreate$1 */
    static final class C313181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313181(Continuation<? super C313181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchlistHomeAppBarDuxo.this.new C313181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchlistHomeAppBarDuxo watchlistHomeAppBarDuxo = WatchlistHomeAppBarDuxo.this;
                this.label = 1;
                if (watchlistHomeAppBarDuxo.streamInboxBadge(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamInboxBadge(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.inboxBadgeStore.streamBadgeResult()), Integer.MAX_VALUE, null, 2, null)), new C313192(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: WatchlistHomeAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "badgeResult", "Lcom/robinhood/models/db/InboxBadge;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$streamInboxBadge$2", m3645f = "WatchlistHomeAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$streamInboxBadge$2 */
    static final class C313192 extends ContinuationImpl7 implements Function2<InboxBadge, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C313192(Continuation<? super C313192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313192 c313192 = WatchlistHomeAppBarDuxo.this.new C313192(continuation);
            c313192.L$0 = obj;
            return c313192;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InboxBadge inboxBadge, Continuation<? super Unit> continuation) {
            return ((C313192) create(inboxBadge, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WatchlistHomeAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/appbar/WatchlistHomeAppBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$streamInboxBadge$2$1", m3645f = "WatchlistHomeAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.appbar.WatchlistHomeAppBarDuxo$streamInboxBadge$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WatchlistHomeAppBarViewState, Continuation<? super WatchlistHomeAppBarViewState>, Object> {
            final /* synthetic */ InboxBadge $badgeResult;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InboxBadge inboxBadge, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$badgeResult = inboxBadge;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$badgeResult, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WatchlistHomeAppBarViewState watchlistHomeAppBarViewState, Continuation<? super WatchlistHomeAppBarViewState> continuation) {
                return ((AnonymousClass1) create(watchlistHomeAppBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((WatchlistHomeAppBarViewState) this.L$0).copy(this.$badgeResult.getResult(), this.$badgeResult.getShouldCriticalBadge());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                WatchlistHomeAppBarDuxo.this.applyMutation(new AnonymousClass1((InboxBadge) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
