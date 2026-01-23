package com.truelayer.payments.core.store.impl;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.PaymentsCoreStore;
import com.truelayer.payments.core.domain.payments.RecentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.store.Providers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ProvidersDataStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0002\u0010\u0012J\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/core/store/impl/ProvidersDataStore;", "Lcom/truelayer/payments/core/store/Providers;", "context", "Landroid/content/Context;", "maxRecordLimit", "", "(Landroid/content/Context;I)V", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/truelayer/payments/core/PaymentsCoreStore;", "addOrUpdate", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/RecentProvider;", "", "provider", "(Lcom/truelayer/payments/core/domain/payments/RecentProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "erase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "remove", "providerId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ProvidersDataStore implements Providers {
    private final DataStore<PaymentsCoreStore> dataStore;
    private final int maxRecordLimit;

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore", m3645f = "ProvidersDataStore.kt", m3646l = {36}, m3647m = "addOrUpdate")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$addOrUpdate$1 */
    static final class C428211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428211(Continuation<? super C428211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProvidersDataStore.this.addOrUpdate(null, this);
        }
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore", m3645f = "ProvidersDataStore.kt", m3646l = {76}, m3647m = "erase")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$erase$1 */
    static final class C428231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428231(Continuation<? super C428231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProvidersDataStore.this.erase(this);
        }
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore", m3645f = "ProvidersDataStore.kt", m3646l = {65}, m3647m = "getAll")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$getAll$1 */
    static final class C428251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428251(Continuation<? super C428251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProvidersDataStore.this.getAll(this);
        }
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore", m3645f = "ProvidersDataStore.kt", m3646l = {54}, m3647m = "remove")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$remove$2 */
    static final class C428272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428272(Continuation<? super C428272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProvidersDataStore.this.remove((String) null, this);
        }
    }

    public ProvidersDataStore(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxRecordLimit = i;
        this.dataStore = ProvidersDataStore3.getDataStore(context);
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/payments/RecentProvider;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$addOrUpdate$2", m3645f = "ProvidersDataStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$addOrUpdate$2 */
    static final class C428222 extends ContinuationImpl7 implements Function1<Continuation<? super RecentProvider>, Object> {
        final /* synthetic */ RecentProvider $provider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428222(RecentProvider recentProvider, Continuation<? super C428222> continuation) {
            super(1, continuation);
            this.$provider = recentProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ProvidersDataStore.this.new C428222(this.$provider, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super RecentProvider> continuation) {
            return ((C428222) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = ProvidersDataStore.this.dataStore;
                ProvidersDataStore2 providersDataStore2 = new ProvidersDataStore2(ProvidersDataStore.this, this.$provider, null);
                this.label = 1;
                obj = dataStore.updateData(providersDataStore2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Outcome.expect$default(ProvidersDataStore3.getProvider((PaymentsCoreStore) obj, this.$provider.getId()), null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.Providers
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addOrUpdate(RecentProvider recentProvider, Continuation<? super Outcome<RecentProvider, ? extends Throwable>> continuation) {
        C428211 c428211;
        if (continuation instanceof C428211) {
            c428211 = (C428211) continuation;
            int i = c428211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428211.label = i - Integer.MIN_VALUE;
            } else {
                c428211 = new C428211(continuation);
            }
        }
        Object objSuspendOutcome = c428211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendOutcome);
            C428222 c428222 = new C428222(recentProvider, null);
            c428211.label = 1;
            objSuspendOutcome = Outcome4.suspendOutcome(c428222, c428211);
            if (objSuspendOutcome == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSuspendOutcome);
        }
        Outcome outcome = (Outcome) objSuspendOutcome;
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.truelayer.payments.core.store.Providers
    public Object remove(RecentProvider recentProvider, Continuation<? super Outcome<Unit, ? extends Throwable>> continuation) {
        return remove(recentProvider.getId(), continuation);
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$remove$3", m3645f = "ProvidersDataStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$remove$3 */
    static final class C428283 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $providerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428283(String str, Continuation<? super C428283> continuation) {
            super(1, continuation);
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ProvidersDataStore.this.new C428283(this.$providerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C428283) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ProvidersDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$remove$3$1", m3645f = "ProvidersDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$remove$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentsCoreStore, Continuation<? super PaymentsCoreStore>, Object> {
            final /* synthetic */ String $providerId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$providerId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$providerId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentsCoreStore paymentsCoreStore, Continuation<? super PaymentsCoreStore> continuation) {
                return ((AnonymousClass1) create(paymentsCoreStore, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PaymentsCoreStore paymentsCoreStoreBuild = ((PaymentsCoreStore) this.L$0).toBuilder().removeProviders(this.$providerId).build();
                Intrinsics.checkNotNullExpressionValue(paymentsCoreStoreBuild, "build(...)");
                return paymentsCoreStoreBuild;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = ProvidersDataStore.this.dataStore;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$providerId, null);
                this.label = 1;
                if (dataStore.updateData(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.Providers
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object remove(String str, Continuation<? super Outcome<Unit, ? extends Throwable>> continuation) {
        C428272 c428272;
        if (continuation instanceof C428272) {
            c428272 = (C428272) continuation;
            int i = c428272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428272.label = i - Integer.MIN_VALUE;
            } else {
                c428272 = new C428272(continuation);
            }
        }
        Object objSuspendOutcome = c428272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendOutcome);
            C428283 c428283 = new C428283(str, null);
            c428272.label = 1;
            objSuspendOutcome = Outcome4.suspendOutcome(c428283, c428272);
            if (objSuspendOutcome == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSuspendOutcome);
        }
        Outcome outcome = (Outcome) objSuspendOutcome;
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lcom/truelayer/payments/core/domain/payments/RecentProvider;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$getAll$2", m3645f = "ProvidersDataStore.kt", m3646l = {66}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$getAll$2 */
    static final class C428262 extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends RecentProvider>>, Object> {
        int label;

        C428262(Continuation<? super C428262> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ProvidersDataStore.this.new C428262(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RecentProvider>> continuation) {
            return invoke2((Continuation<? super List<RecentProvider>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RecentProvider>> continuation) {
            return ((C428262) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = ProvidersDataStore.this.dataStore.getData();
                this.label = 1;
                obj = FlowKt.first(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<PaymentsCoreStore.RecentSingleImmediateProvider> listSortedWith = CollectionsKt.sortedWith(((PaymentsCoreStore) obj).getProvidersMap().values(), new Comparator() { // from class: com.truelayer.payments.core.store.impl.ProvidersDataStore$getAll$2$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((PaymentsCoreStore.RecentSingleImmediateProvider) t2).getLastUsedDate()), Long.valueOf(((PaymentsCoreStore.RecentSingleImmediateProvider) t).getLastUsedDate()));
                }
            });
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
            for (PaymentsCoreStore.RecentSingleImmediateProvider recentSingleImmediateProvider : listSortedWith) {
                Intrinsics.checkNotNull(recentSingleImmediateProvider);
                arrayList.add((RecentProvider) Outcome.expect$default(ProvidersDataStore3.intoDomainProvider(recentSingleImmediateProvider), null, 1, null));
            }
            return CollectionsKt.take(arrayList, ProvidersDataStore.this.maxRecordLimit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.Providers
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAll(Continuation<? super Outcome<? extends List<RecentProvider>, ? extends Throwable>> continuation) {
        C428251 c428251;
        if (continuation instanceof C428251) {
            c428251 = (C428251) continuation;
            int i = c428251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428251.label = i - Integer.MIN_VALUE;
            } else {
                c428251 = new C428251(continuation);
            }
        }
        Object objSuspendOutcome = c428251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendOutcome);
            C428262 c428262 = new C428262(null);
            c428251.label = 1;
            objSuspendOutcome = Outcome4.suspendOutcome(c428262, c428251);
            if (objSuspendOutcome == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSuspendOutcome);
        }
        Outcome outcome = (Outcome) objSuspendOutcome;
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ProvidersDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$erase$2", m3645f = "ProvidersDataStore.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$erase$2 */
    static final class C428242 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C428242(Continuation<? super C428242> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ProvidersDataStore.this.new C428242(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C428242) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ProvidersDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.ProvidersDataStore$erase$2$1", m3645f = "ProvidersDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStore$erase$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentsCoreStore, Continuation<? super PaymentsCoreStore>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentsCoreStore paymentsCoreStore, Continuation<? super PaymentsCoreStore> continuation) {
                return ((AnonymousClass1) create(paymentsCoreStore, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PaymentsCoreStore paymentsCoreStoreBuild = ((PaymentsCoreStore) this.L$0).toBuilder().clearProviders().build();
                Intrinsics.checkNotNullExpressionValue(paymentsCoreStoreBuild, "build(...)");
                return paymentsCoreStoreBuild;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = ProvidersDataStore.this.dataStore;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (dataStore.updateData(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.Providers
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object erase(Continuation<? super Outcome<Unit, ? extends Throwable>> continuation) {
        C428231 c428231;
        if (continuation instanceof C428231) {
            c428231 = (C428231) continuation;
            int i = c428231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428231.label = i - Integer.MIN_VALUE;
            } else {
                c428231 = new C428231(continuation);
            }
        }
        Object objSuspendOutcome = c428231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendOutcome);
            C428242 c428242 = new C428242(null);
            c428231.label = 1;
            objSuspendOutcome = Outcome4.suspendOutcome(c428242, c428231);
            if (objSuspendOutcome == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSuspendOutcome);
        }
        Outcome outcome = (Outcome) objSuspendOutcome;
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }
}
