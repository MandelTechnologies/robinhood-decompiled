package com.robinhood.librobinhood.data.store;

import com.robinhood.android.engagement.crypto.impression.HasCryptoImpressionPref;
import com.robinhood.librobinhood.data.store.AcqCryptoOnboardingM1Exp;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoOnboardingM1Store.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "hasCryptoImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "updateCryptoImpression", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoOnboardingM1Store extends Store {
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final BooleanPreference hasCryptoImpressionPref;
    private final BaseSortingHatStore sortingHatStore;

    /* compiled from: CryptoOnboardingM1Store.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store", m3645f = "CryptoOnboardingM1Store.kt", m3646l = {21}, m3647m = "updateCryptoImpression")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store$updateCryptoImpression$1 */
    static final class C337261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337261(Continuation<? super C337261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoOnboardingM1Store.this.updateCryptoImpression(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOnboardingM1Store(StoreBundle storeBundle, @HasCryptoImpressionPref BooleanPreference hasCryptoImpressionPref, BaseSortingHatStore sortingHatStore, CryptoExperimentsStore cryptoExperimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        this.sortingHatStore = sortingHatStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCryptoImpression(Continuation<? super Unit> continuation) {
        C337261 c337261;
        if (continuation instanceof C337261) {
            c337261 = (C337261) continuation;
            int i = c337261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337261.label = i - Integer.MIN_VALUE;
            } else {
                c337261 = new C337261(continuation);
            }
        }
        Object objFirst = c337261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c337261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<AcqCryptoOnboardingM1Exp.Variant> flowStreamAcqCryptoOnboardingM1Exp = this.cryptoExperimentsStore.streamAcqCryptoOnboardingM1Exp();
            c337261.label = 1;
            objFirst = FlowKt.first(flowStreamAcqCryptoOnboardingM1Exp, c337261);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        if (((AcqCryptoOnboardingM1Exp.Variant) objFirst).getShouldUpdateCryptoImpression() && !this.hasCryptoImpressionPref.get()) {
            this.hasCryptoImpressionPref.set(true);
            this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
        }
        return Unit.INSTANCE;
    }
}
