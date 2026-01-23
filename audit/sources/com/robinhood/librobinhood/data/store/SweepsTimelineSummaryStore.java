package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.sweep.api.SweepApi;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.dao.SweepsTimelineSummaryDao;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;
import p479j$.time.LocalDateTime;

/* compiled from: SweepsTimelineSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/sweep/api/SweepApi;", "sweepApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/SweepsTimelineSummaryDao;", "dao", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/sweep/api/SweepApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/SweepsTimelineSummaryDao;)V", "", "accountNumber", "j$/time/LocalDateTime", "dateTime", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "getTimelineSummary", "(Ljava/lang/String;Lj$/time/LocalDateTime;)Lio/reactivex/Observable;", "getTimelineSummaryIndividualAccount", "(Lj$/time/LocalDateTime;)Lio/reactivex/Observable;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/sweep/api/SweepApi;", "Lcom/robinhood/models/dao/SweepsTimelineSummaryDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore$TimelineSummaryArgs;", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "streamTimelineSummary", "Lcom/robinhood/android/moria/db/Query;", "TimelineSummaryArgs", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SweepsTimelineSummaryStore extends Store {
    private final AccountProvider accountProvider;
    private final SweepsTimelineSummaryDao dao;
    private final Endpoint<TimelineSummaryArgs, ApiSweepsTimelineSummary> getTimelineSummary;
    private final Query<TimelineSummaryArgs, SweepsTimelineSummary> streamTimelineSummary;
    private final SweepApi sweepApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SweepsTimelineSummaryStore(AccountProvider accountProvider, SweepApi sweepApi, StoreBundle storeBundle, SweepsTimelineSummaryDao dao) {
        super(storeBundle, SweepsTimelineSummary.INSTANCE);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepApi, "sweepApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.accountProvider = accountProvider;
        this.sweepApi = sweepApi;
        this.dao = dao;
        this.getTimelineSummary = Endpoint.INSTANCE.create(new C343581(null), getLogoutKillswitch(), new C343592(null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), storeBundle.getClock()));
        this.streamTimelineSummary = Store.create$default(this, Query.INSTANCE, "queryTimelineSummary", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepsTimelineSummaryStore.streamTimelineSummary$lambda$0(this.f$0, (SweepsTimelineSummaryStore.TimelineSummaryArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepsTimelineSummaryStore.streamTimelineSummary$lambda$1(this.f$0, (SweepsTimelineSummaryStore.TimelineSummaryArgs) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: SweepsTimelineSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary;", "it", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore$TimelineSummaryArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$getTimelineSummary$1", m3645f = "SweepsTimelineSummaryStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$getTimelineSummary$1 */
    static final class C343581 extends ContinuationImpl7 implements Function2<TimelineSummaryArgs, Continuation<? super ApiSweepsTimelineSummary>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C343581(Continuation<? super C343581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C343581 c343581 = SweepsTimelineSummaryStore.this.new C343581(continuation);
            c343581.L$0 = obj;
            return c343581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TimelineSummaryArgs timelineSummaryArgs, Continuation<? super ApiSweepsTimelineSummary> continuation) {
            return ((C343581) create(timelineSummaryArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TimelineSummaryArgs timelineSummaryArgs = (TimelineSummaryArgs) this.L$0;
            SweepApi sweepApi = SweepsTimelineSummaryStore.this.sweepApi;
            LocalDateTime datetime = timelineSummaryArgs.getDatetime();
            String accountNumber = timelineSummaryArgs.getAccountNumber();
            this.label = 1;
            Object sweepsTimelineSummary = sweepApi.getSweepsTimelineSummary(datetime, accountNumber, this);
            return sweepsTimelineSummary == coroutine_suspended ? coroutine_suspended : sweepsTimelineSummary;
        }
    }

    /* compiled from: SweepsTimelineSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$getTimelineSummary$2", m3645f = "SweepsTimelineSummaryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore$getTimelineSummary$2 */
    static final class C343592 extends ContinuationImpl7 implements Function2<ApiSweepsTimelineSummary, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C343592(Continuation<? super C343592> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C343592 c343592 = SweepsTimelineSummaryStore.this.new C343592(continuation);
            c343592.L$0 = obj;
            return c343592;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiSweepsTimelineSummary apiSweepsTimelineSummary, Continuation<? super Unit> continuation) {
            return ((C343592) create(apiSweepsTimelineSummary, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SweepsTimelineSummaryStore.this.dao.insertSweepsTimelineSummary((ApiSweepsTimelineSummary) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTimelineSummary$lambda$0(SweepsTimelineSummaryStore sweepsTimelineSummaryStore, TimelineSummaryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Endpoint<TimelineSummaryArgs, ApiSweepsTimelineSummary> endpoint = sweepsTimelineSummaryStore.getTimelineSummary;
        Duration durationOfSeconds = Duration.ofSeconds(15L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, args, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTimelineSummary$lambda$1(SweepsTimelineSummaryStore sweepsTimelineSummaryStore, TimelineSummaryArgs it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sweepsTimelineSummaryStore.dao.getSweepsTimelineSummaries(it.getAccountNumber());
    }

    public static /* synthetic */ Observable getTimelineSummary$default(SweepsTimelineSummaryStore sweepsTimelineSummaryStore, String str, LocalDateTime localDateTime, int i, Object obj) {
        if ((i & 2) != 0) {
            localDateTime = LocalDateTime.now();
        }
        return sweepsTimelineSummaryStore.getTimelineSummary(str, localDateTime);
    }

    public final Observable<? extends SweepsTimelineSummary> getTimelineSummary(String accountNumber, LocalDateTime dateTime) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        return this.streamTimelineSummary.asObservable(new TimelineSummaryArgs(dateTime, accountNumber));
    }

    public static /* synthetic */ Observable getTimelineSummaryIndividualAccount$default(SweepsTimelineSummaryStore sweepsTimelineSummaryStore, LocalDateTime localDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            localDateTime = LocalDateTime.now();
        }
        return sweepsTimelineSummaryStore.getTimelineSummaryIndividualAccount(localDateTime);
    }

    @Deprecated
    public final Observable<SweepsTimelineSummary> getTimelineSummaryIndividualAccount(final LocalDateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Observable observableSwitchMap = this.accountProvider.streamIndividualAccountNumber().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore.getTimelineSummaryIndividualAccount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SweepsTimelineSummary> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return SweepsTimelineSummaryStore.this.streamTimelineSummary.asObservable(new TimelineSummaryArgs(dateTime, accountNumber));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: SweepsTimelineSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore$TimelineSummaryArgs;", "", "j$/time/LocalDateTime", InquiryField.DatetimeField.TYPE, "", "accountNumber", "<init>", "(Lj$/time/LocalDateTime;Ljava/lang/String;)V", "component1", "()Lj$/time/LocalDateTime;", "component2", "()Ljava/lang/String;", "copy", "(Lj$/time/LocalDateTime;Ljava/lang/String;)Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore$TimelineSummaryArgs;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDateTime;", "getDatetime", "Ljava/lang/String;", "getAccountNumber", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TimelineSummaryArgs {
        private final String accountNumber;
        private final LocalDateTime datetime;

        public static /* synthetic */ TimelineSummaryArgs copy$default(TimelineSummaryArgs timelineSummaryArgs, LocalDateTime localDateTime, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                localDateTime = timelineSummaryArgs.datetime;
            }
            if ((i & 2) != 0) {
                str = timelineSummaryArgs.accountNumber;
            }
            return timelineSummaryArgs.copy(localDateTime, str);
        }

        /* renamed from: component1, reason: from getter */
        public final LocalDateTime getDatetime() {
            return this.datetime;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final TimelineSummaryArgs copy(LocalDateTime datetime, String accountNumber) {
            Intrinsics.checkNotNullParameter(datetime, "datetime");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new TimelineSummaryArgs(datetime, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimelineSummaryArgs)) {
                return false;
            }
            TimelineSummaryArgs timelineSummaryArgs = (TimelineSummaryArgs) other;
            return Intrinsics.areEqual(this.datetime, timelineSummaryArgs.datetime) && Intrinsics.areEqual(this.accountNumber, timelineSummaryArgs.accountNumber);
        }

        public int hashCode() {
            return (this.datetime.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "TimelineSummaryArgs(datetime=" + this.datetime + ", accountNumber=" + this.accountNumber + ")";
        }

        public TimelineSummaryArgs(LocalDateTime datetime, String accountNumber) {
            Intrinsics.checkNotNullParameter(datetime, "datetime");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.datetime = datetime;
            this.accountNumber = accountNumber;
        }

        public final LocalDateTime getDatetime() {
            return this.datetime;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }
}
