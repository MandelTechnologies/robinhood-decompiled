package com.robinhood.api.utils;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.utils.PaginationTransformer;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: PaginationTransformer.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002Bm\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0019H\u0016J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/api/utils/PaginationTransformer;", "T", "Lio/reactivex/SingleTransformer;", "Lcom/robinhood/models/PaginatedResult;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "networkWrapper", "Lcom/robinhood/api/utils/NetworkWrapper;", "paginationFactory", "Lcom/robinhood/api/utils/PaginationFactory;", "saveAction", "Lkotlin/Function1;", "", "allowErrors", "", "key", "", "subscribeOnScheduler", "Lio/reactivex/Scheduler;", "paginationScheduler", "worker", "Lio/reactivex/Scheduler$Worker;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/api/utils/NetworkWrapper;Lcom/robinhood/api/utils/PaginationFactory;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler$Worker;)V", "apply", "Lio/reactivex/Single;", "upstream", "pingNextPage", "paginatedResult", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PaginationTransformer<T> implements SingleTransformer<PaginatedResult<? extends T>, PaginatedResult<? extends T>> {
    private final boolean allowErrors;
    private final CoroutineScope coroutineScope;
    private final String key;
    private final NetworkWrapper networkWrapper;
    private final PaginationFactory<T> paginationFactory;
    private final Scheduler paginationScheduler;
    private final Function1<PaginatedResult<? extends T>, Unit> saveAction;
    private final Scheduler subscribeOnScheduler;
    private final Scheduler.Worker worker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaginationTransformer(CoroutineScope coroutineScope, NetworkWrapper networkWrapper, PaginationFactory<T> paginationFactory, Function1<? super PaginatedResult<? extends T>, Unit> saveAction, String key, Scheduler subscribeOnScheduler, Scheduler paginationScheduler) {
        this(coroutineScope, networkWrapper, paginationFactory, saveAction, false, key, subscribeOnScheduler, paginationScheduler, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Intrinsics.checkNotNullParameter(paginationFactory, "paginationFactory");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        Intrinsics.checkNotNullParameter(paginationScheduler, "paginationScheduler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaginationTransformer(CoroutineScope coroutineScope, NetworkWrapper networkWrapper, PaginationFactory<T> paginationFactory, Function1<? super PaginatedResult<? extends T>, Unit> saveAction, boolean z, String key, Scheduler subscribeOnScheduler, Scheduler paginationScheduler) {
        this(coroutineScope, networkWrapper, paginationFactory, saveAction, z, key, subscribeOnScheduler, paginationScheduler, null, 256, null);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Intrinsics.checkNotNullParameter(paginationFactory, "paginationFactory");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        Intrinsics.checkNotNullParameter(paginationScheduler, "paginationScheduler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PaginationTransformer(CoroutineScope coroutineScope, NetworkWrapper networkWrapper, PaginationFactory<T> paginationFactory, Function1<? super PaginatedResult<? extends T>, Unit> saveAction, boolean z, String key, Scheduler subscribeOnScheduler, Scheduler paginationScheduler, Scheduler.Worker worker) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Intrinsics.checkNotNullParameter(paginationFactory, "paginationFactory");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        Intrinsics.checkNotNullParameter(paginationScheduler, "paginationScheduler");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.coroutineScope = coroutineScope;
        this.networkWrapper = networkWrapper;
        this.paginationFactory = paginationFactory;
        this.saveAction = saveAction;
        this.allowErrors = z;
        this.key = key;
        this.subscribeOnScheduler = subscribeOnScheduler;
        this.paginationScheduler = paginationScheduler;
        this.worker = worker;
    }

    public /* synthetic */ PaginationTransformer(CoroutineScope coroutineScope, NetworkWrapper networkWrapper, PaginationFactory paginationFactory, Function1 function1, boolean z, String str, Scheduler scheduler, Scheduler scheduler2, Scheduler.Worker worker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, networkWrapper, paginationFactory, function1, (i & 16) != 0 ? false : z, str, scheduler, scheduler2, (i & 256) != 0 ? Schedulers.trampoline().createWorker() : worker);
    }

    @Override // io.reactivex.SingleTransformer
    public Single<PaginatedResult<T>> apply(Single<PaginatedResult<T>> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Single<PaginatedResult<T>> singleDoAfterSuccess = upstream.doAfterSuccess(new Consumer(this) { // from class: com.robinhood.api.utils.PaginationTransformer.apply.1
            final /* synthetic */ PaginationTransformer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(PaginatedResult<? extends T> paginatedResult) {
                PaginationTransformer<T> paginationTransformer = this.this$0;
                String str = ((PaginationTransformer) paginationTransformer).key;
                Scheduler.Worker worker = ((PaginationTransformer) this.this$0).worker;
                Intrinsics.checkNotNull(paginatedResult);
                paginationTransformer.pingNextPage(str, worker, paginatedResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pingNextPage(String key, Scheduler.Worker worker, PaginatedResult<? extends T> paginatedResult) {
        PaginationCursor next = paginatedResult.getNext();
        String value = next != null ? next.getValue() : null;
        if (value == null) {
            worker.dispose();
            return;
        }
        worker.schedule(new RunnableC316221(this, value, key + value, worker));
    }

    /* compiled from: PaginationTransformer.kt */
    @kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.PaginationTransformer$pingNextPage$1 */
    static final class RunnableC316221 implements Runnable {
        final /* synthetic */ String $paginatedKey;
        final /* synthetic */ String $paginationCursor;
        final /* synthetic */ Scheduler.Worker $worker;
        final /* synthetic */ PaginationTransformer<T> this$0;

        RunnableC316221(PaginationTransformer<T> paginationTransformer, String str, String str2, Scheduler.Worker worker) {
            this.this$0 = paginationTransformer;
            this.$paginationCursor = str;
            this.$paginatedKey = str2;
            this.$worker = worker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean run$lambda$0(String str, Instant instant) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Maybe<T> maybe = ((PaginationTransformer) this.this$0).paginationFactory.generate(this.$paginationCursor).subscribeOn(((PaginationTransformer) this.this$0).paginationScheduler).compose(new PaginationTransformer(((PaginationTransformer) this.this$0).coroutineScope, ((PaginationTransformer) this.this$0).networkWrapper, ((PaginationTransformer) this.this$0).paginationFactory, ((PaginationTransformer) this.this$0).saveAction, ((PaginationTransformer) this.this$0).allowErrors, this.$paginatedKey, ((PaginationTransformer) this.this$0).subscribeOnScheduler, ((PaginationTransformer) this.this$0).paginationScheduler, this.$worker)).toMaybe();
            NetworkWrapper networkWrapper = ((PaginationTransformer) this.this$0).networkWrapper;
            Intrinsics.checkNotNull(maybe);
            ScopedSubscriptionKt.subscribeIn(networkWrapper.refresh(maybe, ((PaginationTransformer) this.this$0).saveAction, new Function2() { // from class: com.robinhood.api.utils.PaginationTransformer$pingNextPage$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(PaginationTransformer.RunnableC316221.run$lambda$0((String) obj, (Instant) obj2));
                }
            }, ((PaginationTransformer) this.this$0).paginationScheduler, this.$paginatedKey, true, ((PaginationTransformer) this.this$0).allowErrors), ((PaginationTransformer) this.this$0).coroutineScope);
        }
    }
}
