package com.robinhood.android.crypto.tab.p093ui.lists;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import com.robinhood.staticcontent.model.MobileContentPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDataState;", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleStateProvider;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleStateProvider;Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;Lcom/robinhood/contentful/StaticContentStore;)V", "onCreate", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeWatchlistTitleDuxo extends BaseDuxo<CryptoHomeWatchlistTitleDataState, CryptoHomeWatchlistTitleViewState> {
    public static final int $stable = 8;
    private final BffCryptoTradingStore bffCryptoTradingStore;
    private final StaticContentStore staticContentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeWatchlistTitleDuxo(DuxoBundle duxoBundle, CryptoHomeWatchlistTitleDuxo3 stateProvider, BffCryptoTradingStore bffCryptoTradingStore, StaticContentStore staticContentStore) {
        super(new CryptoHomeWatchlistTitleDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.bffCryptoTradingStore = bffCryptoTradingStore;
        this.staticContentStore = staticContentStore;
    }

    /* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleDuxo$onCreate$1", m3645f = "CryptoHomeWatchlistTitleDuxo.kt", m3646l = {30, 31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleDuxo$onCreate$1 */
    static final class C131671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131671(Continuation<? super C131671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeWatchlistTitleDuxo.this.new C131671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r10 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C131671 c131671;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BffCryptoTradingStore bffCryptoTradingStore = CryptoHomeWatchlistTitleDuxo.this.bffCryptoTradingStore;
                this.label = 1;
                obj = bffCryptoTradingStore.fetchWatchlistExplainer(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c131671 = this;
                CryptoHomeWatchlistTitleDuxo.this.applyMutation(new AnonymousClass1((MobileContentPage) ((EntryResource) obj).getValue(), null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = CryptoHomeWatchlistTitleDuxo.this.staticContentStore;
            this.label = 2;
            c131671 = this;
            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, (String) obj, null, c131671, 2, null);
        }

        /* compiled from: CryptoHomeWatchlistTitleDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleDuxo$onCreate$1$1", m3645f = "CryptoHomeWatchlistTitleDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistTitleDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeWatchlistTitleDataState, Continuation<? super CryptoHomeWatchlistTitleDataState>, Object> {
            final /* synthetic */ MobileContentPage $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MobileContentPage mobileContentPage, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = mobileContentPage;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoHomeWatchlistTitleDataState cryptoHomeWatchlistTitleDataState, Continuation<? super CryptoHomeWatchlistTitleDataState> continuation) {
                return ((AnonymousClass1) create(cryptoHomeWatchlistTitleDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoHomeWatchlistTitleDataState) this.L$0).copy(this.$content);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131671(null));
    }
}
