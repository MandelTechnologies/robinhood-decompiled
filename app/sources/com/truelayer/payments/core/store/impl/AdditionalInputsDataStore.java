package com.truelayer.payments.core.store.impl;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.PaymentsCoreStore;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.store.AdditionalInputs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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

/* compiled from: AdditionalInputsDataStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0002\u0010\u0010J=\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\tH\u0096@¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001c\u0012\u0004\u0012\u00020\f0\tH\u0096@¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001dJ6\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0096@¢\u0006\u0002\u0010\u0010J(\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001dR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/store/impl/AdditionalInputsDataStore;", "Lcom/truelayer/payments/core/store/AdditionalInputs;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/truelayer/payments/core/PaymentsCoreStore;", "addOrReplace", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "", "providerId", "", "inputs", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrUpdate", "input", "maxEntriesPerId", "Lkotlin/UByte;", "addOrUpdate-SpDDLgk", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/List;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "erase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "inputIds", "removeAll", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AdditionalInputsDataStore implements AdditionalInputs {
    private final DataStore<PaymentsCoreStore> dataStore;

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore", m3645f = "AdditionalInputsDataStore.kt", m3646l = {19}, m3647m = "addOrReplace")
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrReplace$1 */
    static final class C428111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428111(Continuation<? super C428111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdditionalInputsDataStore.this.addOrReplace(null, null, this);
        }
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore", m3645f = "AdditionalInputsDataStore.kt", m3646l = {67, 73, 79}, m3647m = "remove")
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$remove$1 */
    static final class C428161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C428161(Continuation<? super C428161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdditionalInputsDataStore.this.remove((String) null, (List<String>) null, this);
        }
    }

    public AdditionalInputsDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataStore = ProvidersDataStore3.getDataStore(context);
    }

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    public Object remove(String str, String str2, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        return AdditionalInputs.DefaultImpls.remove(this, str, str2, continuation);
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrReplace$2", m3645f = "AdditionalInputsDataStore.kt", m3646l = {20}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrReplace$2 */
    static final class C428122 extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends RecentAdditionalInput>>, Object> {
        final /* synthetic */ List<RecentAdditionalInput> $inputs;
        final /* synthetic */ String $providerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428122(List<RecentAdditionalInput> list, String str, Continuation<? super C428122> continuation) {
            super(1, continuation);
            this.$inputs = list;
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdditionalInputsDataStore.this.new C428122(this.$inputs, this.$providerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RecentAdditionalInput>> continuation) {
            return invoke2((Continuation<? super List<RecentAdditionalInput>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RecentAdditionalInput>> continuation) {
            return ((C428122) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdditionalInputsDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrReplace$2$1", m3645f = "AdditionalInputsDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrReplace$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentsCoreStore, Continuation<? super PaymentsCoreStore>, Object> {
            final /* synthetic */ List<RecentAdditionalInput> $inputs;
            final /* synthetic */ String $providerId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, List<RecentAdditionalInput> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$providerId = str;
                this.$inputs = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$providerId, this.$inputs, continuation);
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
                PaymentsCoreStore.Builder builder = ((PaymentsCoreStore) this.L$0).toBuilder();
                PaymentsCoreStore.RecentAdditionalInputPerProvider.Builder providerId = PaymentsCoreStore.RecentAdditionalInputPerProvider.newBuilder().setProviderId(this.$providerId);
                List<RecentAdditionalInput> list = this.$inputs;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProvidersDataStore3.intoRecentAdditionalInput((RecentAdditionalInput) it.next()));
                }
                builder.putAdditionalInputs(this.$providerId, providerId.addAllAdditionalInputs(arrayList).build());
                PaymentsCoreStore paymentsCoreStoreBuild = builder.build();
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
                DataStore dataStore = AdditionalInputsDataStore.this.dataStore;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$providerId, this.$inputs, null);
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
            return this.$inputs;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.AdditionalInputs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addOrReplace(String str, List<RecentAdditionalInput> list, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        C428111 c428111;
        if (continuation instanceof C428111) {
            c428111 = (C428111) continuation;
            int i = c428111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428111.label = i - Integer.MIN_VALUE;
            } else {
                c428111 = new C428111(continuation);
            }
        }
        Object objSuspendOutcome = c428111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendOutcome);
            C428122 c428122 = new C428122(list, str, null);
            c428111.label = 1;
            objSuspendOutcome = Outcome4.suspendOutcome(c428122, c428111);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.AdditionalInputs
    /* renamed from: addOrUpdate-SpDDLgk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27023addOrUpdateSpDDLgk(String str, List<RecentAdditionalInput> list, byte b, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        AdditionalInputsDataStore2 additionalInputsDataStore2;
        AdditionalInputsDataStore additionalInputsDataStore;
        if (continuation instanceof AdditionalInputsDataStore2) {
            additionalInputsDataStore2 = (AdditionalInputsDataStore2) continuation;
            int i = additionalInputsDataStore2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                additionalInputsDataStore2.label = i - Integer.MIN_VALUE;
            } else {
                additionalInputsDataStore2 = new AdditionalInputsDataStore2(this, continuation);
            }
        }
        Object all = additionalInputsDataStore2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = additionalInputsDataStore2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(all);
            additionalInputsDataStore2.L$0 = this;
            additionalInputsDataStore2.L$1 = str;
            additionalInputsDataStore2.L$2 = list;
            additionalInputsDataStore2.B$0 = b;
            additionalInputsDataStore2.label = 1;
            all = getAll(str, additionalInputsDataStore2);
            if (all != coroutine_suspended) {
                additionalInputsDataStore = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(all);
            return all;
        }
        b = additionalInputsDataStore2.B$0;
        list = (List) additionalInputsDataStore2.L$2;
        str = (String) additionalInputsDataStore2.L$1;
        additionalInputsDataStore = (AdditionalInputsDataStore) additionalInputsDataStore2.L$0;
        ResultKt.throwOnFailure(all);
        List<RecentAdditionalInput> mutableList = CollectionsKt.toMutableList((Collection) Outcome4.orDefault((Outcome) all, CollectionsKt.emptyList()));
        mutableList.addAll(list);
        List<RecentAdditionalInput> list2 = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecentAdditionalInput) it.next()).getInputId());
        }
        for (String str2 : CollectionsKt.distinct(arrayList)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (Intrinsics.areEqual(((RecentAdditionalInput) obj).getInputId(), str2)) {
                    arrayList2.add(obj);
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrUpdate-SpDDLgk$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((RecentAdditionalInput) t2).getLastUsedDate(), ((RecentAdditionalInput) t).getLastUsedDate());
                }
            });
            int i3 = b & 255;
            if (listSortedWith.size() > i3) {
                mutableList.removeAll(CollectionsKt.drop(listSortedWith, i3));
            }
        }
        additionalInputsDataStore2.L$0 = null;
        additionalInputsDataStore2.L$1 = null;
        additionalInputsDataStore2.L$2 = null;
        additionalInputsDataStore2.label = 2;
        Object objAddOrReplace = additionalInputsDataStore.addOrReplace(str, mutableList, additionalInputsDataStore2);
        return objAddOrReplace == coroutine_suspended ? coroutine_suspended : objAddOrReplace;
    }

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    /* renamed from: addOrUpdate-SpDDLgk */
    public Object mo27022addOrUpdateSpDDLgk(String str, RecentAdditionalInput recentAdditionalInput, byte b, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        return mo27023addOrUpdateSpDDLgk(str, CollectionsKt.listOf(recentAdditionalInput), b, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.AdditionalInputs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object remove(String str, List<String> list, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        C428161 c428161;
        AdditionalInputsDataStore additionalInputsDataStore;
        List list2;
        Outcome outcome;
        if (continuation instanceof C428161) {
            c428161 = (C428161) continuation;
            int i = c428161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428161.label = i - Integer.MIN_VALUE;
            } else {
                c428161 = new C428161(continuation);
            }
        }
        Object all = c428161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(all);
            c428161.L$0 = this;
            c428161.L$1 = str;
            c428161.L$2 = list;
            c428161.label = 1;
            all = getAll(str, c428161);
            if (all != coroutine_suspended) {
                additionalInputsDataStore = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(all);
                return all;
            }
            list2 = (List) c428161.L$0;
            ResultKt.throwOnFailure(all);
            outcome = (Outcome) all;
            if (!(outcome instanceof Ok)) {
                return new Ok(list2);
            }
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
        list = (List) c428161.L$2;
        str = (String) c428161.L$1;
        additionalInputsDataStore = (AdditionalInputsDataStore) c428161.L$0;
        ResultKt.throwOnFailure(all);
        List<RecentAdditionalInput> mutableList = CollectionsKt.toMutableList((Collection) Outcome4.orDefault((Outcome) all, CollectionsKt.emptyList()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : mutableList) {
            if (list.contains(((RecentAdditionalInput) obj).getInputId())) {
                arrayList.add(obj);
            }
        }
        mutableList.removeAll(arrayList);
        if (!mutableList.isEmpty()) {
            c428161.L$0 = arrayList;
            c428161.L$1 = null;
            c428161.L$2 = null;
            c428161.label = 2;
            all = additionalInputsDataStore.addOrReplace(str, mutableList, c428161);
            if (all != coroutine_suspended) {
                list2 = arrayList;
                outcome = (Outcome) all;
                if (!(outcome instanceof Ok)) {
                }
            }
        } else {
            c428161.L$0 = null;
            c428161.L$1 = null;
            c428161.L$2 = null;
            c428161.label = 3;
            Object objRemoveAll = additionalInputsDataStore.removeAll(str, c428161);
            if (objRemoveAll != coroutine_suspended) {
                return objRemoveAll;
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$removeAll$2", m3645f = "AdditionalInputsDataStore.kt", m3646l = {84, 86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$removeAll$2 */
    static final class C428172 extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends RecentAdditionalInput>>, Object> {
        final /* synthetic */ String $providerId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428172(String str, Continuation<? super C428172> continuation) {
            super(1, continuation);
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdditionalInputsDataStore.this.new C428172(this.$providerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RecentAdditionalInput>> continuation) {
            return invoke2((Continuation<? super List<RecentAdditionalInput>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RecentAdditionalInput>> continuation) {
            return ((C428172) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List list;
            List<PaymentsCoreStore.RecentAdditionalInput> additionalInputsList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = AdditionalInputsDataStore.this.dataStore.getData();
                this.label = 1;
                obj = FlowKt.first(data, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                return list != null ? CollectionsKt.emptyList() : list;
            }
            ResultKt.throwOnFailure(obj);
            PaymentsCoreStore.RecentAdditionalInputPerProvider recentAdditionalInputPerProvider = ((PaymentsCoreStore) obj).getAdditionalInputsMap().get(this.$providerId);
            if (recentAdditionalInputPerProvider == null || (additionalInputsList = recentAdditionalInputPerProvider.getAdditionalInputsList()) == null) {
                arrayList = null;
            } else {
                List<PaymentsCoreStore.RecentAdditionalInput> list2 = additionalInputsList;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (PaymentsCoreStore.RecentAdditionalInput recentAdditionalInput : list2) {
                    Intrinsics.checkNotNull(recentAdditionalInput);
                    arrayList.add(ProvidersDataStore3.intoDomainRecentAdditionalInput(recentAdditionalInput));
                }
            }
            DataStore dataStore = AdditionalInputsDataStore.this.dataStore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$providerId, null);
            this.L$0 = arrayList;
            this.label = 2;
            if (dataStore.updateData(anonymousClass1, this) != coroutine_suspended) {
                list = arrayList;
                if (list != null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: AdditionalInputsDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$removeAll$2$1", m3645f = "AdditionalInputsDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$removeAll$2$1, reason: invalid class name */
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
                PaymentsCoreStore paymentsCoreStoreBuild = ((PaymentsCoreStore) this.L$0).toBuilder().removeAdditionalInputs(this.$providerId).build();
                Intrinsics.checkNotNullExpressionValue(paymentsCoreStoreBuild, "build(...)");
                return paymentsCoreStoreBuild;
            }
        }
    }

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    public Object removeAll(String str, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        return Outcome4.suspendOutcome(new C428172(str, null), continuation);
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$2", m3645f = "AdditionalInputsDataStore.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$2 */
    static final class C428142 extends ContinuationImpl7 implements Function1<Continuation<? super Map<String, ? extends List<? extends RecentAdditionalInput>>>, Object> {
        int label;

        C428142(Continuation<? super C428142> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdditionalInputsDataStore.this.new C428142(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Map<String, ? extends List<? extends RecentAdditionalInput>>> continuation) {
            return invoke2((Continuation<? super Map<String, ? extends List<RecentAdditionalInput>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Map<String, ? extends List<RecentAdditionalInput>>> continuation) {
            return ((C428142) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = AdditionalInputsDataStore.this.dataStore.getData();
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
            Map<String, PaymentsCoreStore.RecentAdditionalInputPerProvider> additionalInputsMap = ((PaymentsCoreStore) obj).getAdditionalInputsMap();
            Intrinsics.checkNotNull(additionalInputsMap);
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(additionalInputsMap.size()));
            Iterator<T> it = additionalInputsMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                List<PaymentsCoreStore.RecentAdditionalInput> additionalInputsList = ((PaymentsCoreStore.RecentAdditionalInputPerProvider) entry.getValue()).getAdditionalInputsList();
                Intrinsics.checkNotNullExpressionValue(additionalInputsList, "getAdditionalInputsList(...)");
                List<PaymentsCoreStore.RecentAdditionalInput> list = additionalInputsList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (PaymentsCoreStore.RecentAdditionalInput recentAdditionalInput : list) {
                    Intrinsics.checkNotNull(recentAdditionalInput);
                    arrayList.add(ProvidersDataStore3.intoDomainRecentAdditionalInput(recentAdditionalInput));
                }
                linkedHashMap.put(key, CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$2$invokeSuspend$lambda$2$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((RecentAdditionalInput) t2).getLastUsedDate(), ((RecentAdditionalInput) t).getLastUsedDate());
                    }
                }));
            }
            return linkedHashMap;
        }
    }

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    public Object getAll(Continuation<? super Outcome<? extends Map<String, ? extends List<RecentAdditionalInput>>, ? extends Throwable>> continuation) {
        return Outcome4.suspendOutcome(new C428142(null), continuation);
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$4", m3645f = "AdditionalInputsDataStore.kt", m3646l = {100}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$4 */
    static final class C428154 extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends RecentAdditionalInput>>, Object> {
        final /* synthetic */ String $providerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428154(String str, Continuation<? super C428154> continuation) {
            super(1, continuation);
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdditionalInputsDataStore.this.new C428154(this.$providerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RecentAdditionalInput>> continuation) {
            return invoke2((Continuation<? super List<RecentAdditionalInput>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<RecentAdditionalInput>> continuation) {
            return ((C428154) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<PaymentsCoreStore.RecentAdditionalInput> additionalInputsList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = AdditionalInputsDataStore.this.dataStore.getData();
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
            PaymentsCoreStore.RecentAdditionalInputPerProvider recentAdditionalInputPerProvider = ((PaymentsCoreStore) obj).getAdditionalInputsMap().get(this.$providerId);
            if (recentAdditionalInputPerProvider != null && (additionalInputsList = recentAdditionalInputPerProvider.getAdditionalInputsList()) != null) {
                List<PaymentsCoreStore.RecentAdditionalInput> list = additionalInputsList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (PaymentsCoreStore.RecentAdditionalInput recentAdditionalInput : list) {
                    Intrinsics.checkNotNull(recentAdditionalInput);
                    arrayList.add(ProvidersDataStore3.intoDomainRecentAdditionalInput(recentAdditionalInput));
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$getAll$4$invokeSuspend$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((RecentAdditionalInput) t2).getLastUsedDate(), ((RecentAdditionalInput) t).getLastUsedDate());
                    }
                });
                if (listSortedWith != null) {
                    return listSortedWith;
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    public Object getAll(String str, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
        return Outcome4.suspendOutcome(new C428154(str, null), continuation);
    }

    /* compiled from: AdditionalInputsDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$erase$2", m3645f = "AdditionalInputsDataStore.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$erase$2 */
    static final class C428132 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C428132(Continuation<? super C428132> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdditionalInputsDataStore.this.new C428132(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C428132) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdditionalInputsDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$erase$2$1", m3645f = "AdditionalInputsDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$erase$2$1, reason: invalid class name */
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
                PaymentsCoreStore paymentsCoreStoreBuild = ((PaymentsCoreStore) this.L$0).toBuilder().clearAdditionalInputs().build();
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
                DataStore dataStore = AdditionalInputsDataStore.this.dataStore;
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

    @Override // com.truelayer.payments.core.store.AdditionalInputs
    public Object erase(Continuation<? super Outcome<Unit, ? extends Throwable>> continuation) {
        return Outcome4.suspendOutcome(new C428132(null), continuation);
    }
}
