package com.robinhood.android.cash.flat.cashback.p071ui.common;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseFlatCashbackDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u0014*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0004:\u0001\u0014B9\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDuxo;", "T", "", "VS", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "initialDataState", "<init>", "(Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;)V", "onStart", "", "reload", "loadContent", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public class BaseFlatCashbackDuxo<T, VS> extends BaseDuxo<BaseFlatCashbackDataState<T>, BaseFlatCashbackViewState<VS>> {
    public static final String CONTENTFUL_ID = "SDdeJGbpnCXA0nbng64EI";
    private final RealProductMarketingStore realProductMarketingStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFlatCashbackDuxo(RealProductMarketingStore realProductMarketingStore, BaseFlatCashbackStateProvider<T, VS> stateProvider, DuxoBundle duxoBundle, BaseFlatCashbackDataState<T> initialDataState) {
        super(initialDataState, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        this.realProductMarketingStore = realProductMarketingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loadContent();
    }

    /* compiled from: BaseFlatCashbackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "T", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$reload$1", m3645f = "BaseFlatCashbackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$reload$1 */
    static final class C101051 extends ContinuationImpl7 implements Function2<BaseFlatCashbackDataState<T>, Continuation<? super BaseFlatCashbackDataState<T>>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C101051(Continuation<? super C101051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C101051 c101051 = new C101051(continuation);
            c101051.L$0 = obj;
            return c101051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseFlatCashbackDataState<T> baseFlatCashbackDataState, Continuation<? super BaseFlatCashbackDataState<T>> continuation) {
            return ((C101051) create(baseFlatCashbackDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BaseFlatCashbackDataState.copy$default((BaseFlatCashbackDataState) this.L$0, null, null, null, 4, null);
        }
    }

    public final void reload() {
        applyMutation(new C101051(null));
        loadContent();
    }

    /* compiled from: BaseFlatCashbackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$loadContent$1", m3645f = "BaseFlatCashbackDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$loadContent$1 */
    static final class C101041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
        int label;
        final /* synthetic */ BaseFlatCashbackDuxo<T, VS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C101041(BaseFlatCashbackDuxo<T, VS> baseFlatCashbackDuxo, Continuation<? super C101041> continuation) {
            super(2, continuation);
            this.this$0 = baseFlatCashbackDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C101041(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
            return ((C101041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RealProductMarketingStore realProductMarketingStore = ((BaseFlatCashbackDuxo) this.this$0).realProductMarketingStore;
            this.label = 1;
            Object objLoad$default = ContentStore.DefaultImpls.load$default(realProductMarketingStore, BaseFlatCashbackDuxo.CONTENTFUL_ID, null, this, 2, null);
            return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
        }
    }

    public void loadContent() {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C101041(this, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFlatCashbackDuxo.loadContent$lambda$0(this.f$0, (ProductMarketingContent) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.flat.cashback.ui.common.BaseFlatCashbackDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFlatCashbackDuxo.loadContent$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContent$lambda$0(BaseFlatCashbackDuxo baseFlatCashbackDuxo, ProductMarketingContent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseFlatCashbackDuxo.applyMutation(new BaseFlatCashbackDuxo2(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContent$lambda$1(BaseFlatCashbackDuxo baseFlatCashbackDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseFlatCashbackDuxo.applyMutation(new BaseFlatCashbackDuxo3(it, null));
        return Unit.INSTANCE;
    }
}
