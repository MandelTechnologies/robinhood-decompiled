package com.truelayer.payments.core.store.impl;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.PaymentsCoreStore;
import com.truelayer.payments.core.store.CountryStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CountryDataStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/core/store/impl/CountryDataStore;", "Lcom/truelayer/payments/core/store/CountryStore;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/truelayer/payments/core/PaymentsCoreStore;", "getLastUsedCountryCode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastUsed", "", "countryCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CountryDataStore implements CountryStore {
    private final DataStore<PaymentsCoreStore> dataStore;

    /* compiled from: CountryDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.CountryDataStore", m3645f = "CountryDataStore.kt", m3646l = {23}, m3647m = "getLastUsedCountryCode")
    /* renamed from: com.truelayer.payments.core.store.impl.CountryDataStore$getLastUsedCountryCode$1 */
    static final class C428181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C428181(Continuation<? super C428181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CountryDataStore.this.getLastUsedCountryCode(this);
        }
    }

    public CountryDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataStore = ProvidersDataStore3.getDataStore(context);
    }

    /* compiled from: CountryDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/PaymentsCoreStore;", PlaceTypes.STORE}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.CountryDataStore$saveLastUsed$2", m3645f = "CountryDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.store.impl.CountryDataStore$saveLastUsed$2 */
    static final class C428192 extends ContinuationImpl7 implements Function2<PaymentsCoreStore, Continuation<? super PaymentsCoreStore>, Object> {
        final /* synthetic */ String $countryCode;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CountryDataStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428192(String str, CountryDataStore countryDataStore, Continuation<? super C428192> continuation) {
            super(2, continuation);
            this.$countryCode = str;
            this.this$0 = countryDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C428192 c428192 = new C428192(this.$countryCode, this.this$0, continuation);
            c428192.L$0 = obj;
            return c428192;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentsCoreStore paymentsCoreStore, Continuation<? super PaymentsCoreStore> continuation) {
            return ((C428192) create(paymentsCoreStore, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentsCoreStore.Builder builder = ((PaymentsCoreStore) this.L$0).toBuilder();
            String str = this.$countryCode;
            if (str == null || builder.setLastUsedCountryCode(str) == null) {
                builder.clearLastUsedCountryCode();
            }
            PaymentsCoreStore paymentsCoreStoreBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(paymentsCoreStoreBuild, "build(...)");
            return paymentsCoreStoreBuild;
        }
    }

    @Override // com.truelayer.payments.core.store.CountryStore
    public Object saveLastUsed(String str, Continuation<? super Unit> continuation) {
        Object objUpdateData = this.dataStore.updateData(new C428192(str, this, null), continuation);
        return objUpdateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.truelayer.payments.core.store.CountryStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLastUsedCountryCode(Continuation<? super String> continuation) {
        C428181 c428181;
        if (continuation instanceof C428181) {
            c428181 = (C428181) continuation;
            int i = c428181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c428181.label = i - Integer.MIN_VALUE;
            } else {
                c428181 = new C428181(continuation);
            }
        }
        Object objFirst = c428181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c428181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<PaymentsCoreStore> data = this.dataStore.getData();
            c428181.label = 1;
            objFirst = FlowKt.first(data, c428181);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        String lastUsedCountryCode = ((PaymentsCoreStore) objFirst).getLastUsedCountryCode();
        if (lastUsedCountryCode.length() == 0) {
            return null;
        }
        return lastUsedCountryCode;
    }
}
