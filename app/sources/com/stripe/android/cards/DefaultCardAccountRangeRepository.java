package com.stripe.android.cards;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.uicore.utils.StateFlows2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultCardAccountRangeRepository.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "inMemorySource", "remoteSource", "staticSource", "Lcom/stripe/android/cards/CardAccountRangeStore;", PlaceTypes.STORE, "<init>", "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "Lcom/stripe/android/model/AccountRange;", "getAccountRanges", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Lkotlinx/coroutines/flow/StateFlow;", "", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DefaultCardAccountRangeRepository implements CardAccountRangeRepository {
    private final CardAccountRangeSource inMemorySource;
    private final StateFlow<Boolean> loading;
    private final CardAccountRangeSource remoteSource;
    private final CardAccountRangeSource staticSource;
    private final CardAccountRangeStore store;

    /* compiled from: DefaultCardAccountRangeRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.cards.DefaultCardAccountRangeRepository", m3645f = "DefaultCardAccountRangeRepository.kt", m3646l = {31, 32, 34, 37}, m3647m = "getAccountRanges")
    /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRanges$1 */
    static final class C425121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C425121(Continuation<? super C425121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultCardAccountRangeRepository.this.getAccountRanges(null, this);
        }
    }

    public DefaultCardAccountRangeRepository(CardAccountRangeSource inMemorySource, CardAccountRangeSource remoteSource, CardAccountRangeSource staticSource, CardAccountRangeStore store) {
        Intrinsics.checkNotNullParameter(inMemorySource, "inMemorySource");
        Intrinsics.checkNotNullParameter(remoteSource, "remoteSource");
        Intrinsics.checkNotNullParameter(staticSource, "staticSource");
        Intrinsics.checkNotNullParameter(store, "store");
        this.inMemorySource = inMemorySource;
        this.remoteSource = remoteSource;
        this.staticSource = staticSource;
        this.store = store;
        this.loading = StateFlows2.combineAsStateFlow(inMemorySource.getLoading(), remoteSource.getLoading(), staticSource.getLoading(), new Function3<Boolean, Boolean, Boolean, Boolean>() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepository$loading$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2, Boolean bool3) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            }

            public final Boolean invoke(boolean z, boolean z2, boolean z3) {
                return Boolean.valueOf(z || z2 || z3);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r10 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        C425121 c425121;
        DefaultCardAccountRangeRepository defaultCardAccountRangeRepository;
        List list;
        if (continuation instanceof C425121) {
            c425121 = (C425121) continuation;
            int i = c425121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425121.label = i - Integer.MIN_VALUE;
            } else {
                c425121 = new C425121(continuation);
            }
        }
        Object objContains = c425121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objContains);
            Bin bin = unvalidated.getBin();
            if (bin == null) {
                return null;
            }
            CardAccountRangeStore cardAccountRangeStore = this.store;
            c425121.L$0 = this;
            c425121.L$1 = unvalidated;
            c425121.label = 1;
            objContains = cardAccountRangeStore.contains(bin, c425121);
            if (objContains != coroutine_suspended) {
                defaultCardAccountRangeRepository = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            unvalidated = (CardNumber.Unvalidated) c425121.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c425121.L$0;
            ResultKt.throwOnFailure(objContains);
        } else if (i2 == 2) {
            unvalidated = (CardNumber.Unvalidated) c425121.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c425121.L$0;
            ResultKt.throwOnFailure(objContains);
            list = (List) objContains;
            if (list != null) {
            }
            CardAccountRangeSource cardAccountRangeSource = defaultCardAccountRangeRepository.staticSource;
            c425121.L$0 = null;
            c425121.L$1 = null;
            c425121.label = 4;
            objContains = cardAccountRangeSource.getAccountRanges(unvalidated, c425121);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objContains);
                return (List) objContains;
            }
            unvalidated = (CardNumber.Unvalidated) c425121.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c425121.L$0;
            ResultKt.throwOnFailure(objContains);
            list = (List) objContains;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    return list;
                }
            }
            CardAccountRangeSource cardAccountRangeSource2 = defaultCardAccountRangeRepository.staticSource;
            c425121.L$0 = null;
            c425121.L$1 = null;
            c425121.label = 4;
            objContains = cardAccountRangeSource2.getAccountRanges(unvalidated, c425121);
        }
        if (((Boolean) objContains).booleanValue()) {
            CardAccountRangeSource cardAccountRangeSource3 = defaultCardAccountRangeRepository.inMemorySource;
            c425121.L$0 = defaultCardAccountRangeRepository;
            c425121.L$1 = unvalidated;
            c425121.label = 2;
            objContains = cardAccountRangeSource3.getAccountRanges(unvalidated, c425121);
        } else {
            CardAccountRangeSource cardAccountRangeSource4 = defaultCardAccountRangeRepository.remoteSource;
            c425121.L$0 = defaultCardAccountRangeRepository;
            c425121.L$1 = unvalidated;
            c425121.label = 3;
            objContains = cardAccountRangeSource4.getAccountRanges(unvalidated, c425121);
        }
        return coroutine_suspended;
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }
}
