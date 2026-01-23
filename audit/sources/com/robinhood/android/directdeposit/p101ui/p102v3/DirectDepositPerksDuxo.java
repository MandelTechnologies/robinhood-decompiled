package com.robinhood.android.directdeposit.p101ui.p102v3;

import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositPerksViewState;
import com.robinhood.android.udf.BaseDuxo4;
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

/* compiled from: DirectDepositPerksDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "realProductMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;)V", "onStart", "", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectDepositPerksDuxo extends BaseDuxo4<DirectDepositPerksViewState> {
    public static final String CONTENTFUL_ID = "1X4qgtN5tATMyAJQbQAT64";
    private final RealProductMarketingStore realProductMarketingStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositPerksDuxo(DuxoBundle duxoBundle, RealProductMarketingStore realProductMarketingStore) {
        super(DirectDepositPerksViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(realProductMarketingStore, "realProductMarketingStore");
        this.realProductMarketingStore = realProductMarketingStore;
    }

    /* compiled from: DirectDepositPerksDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositPerksDuxo$onStart$1", m3645f = "DirectDepositPerksDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositPerksDuxo$onStart$1 */
    static final class C141611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
        int label;

        C141611(Continuation<? super C141611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositPerksDuxo.this.new C141611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
            return ((C141611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RealProductMarketingStore realProductMarketingStore = DirectDepositPerksDuxo.this.realProductMarketingStore;
            this.label = 1;
            Object objLoad$default = ContentStore.DefaultImpls.load$default(realProductMarketingStore, DirectDepositPerksDuxo.CONTENTFUL_ID, null, this, 2, null);
            return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C141611(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositPerksDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositPerksDuxo.onStart$lambda$0(this.f$0, (ProductMarketingContent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DirectDepositPerksDuxo directDepositPerksDuxo, ProductMarketingContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        directDepositPerksDuxo.applyMutation(new DirectDepositPerksDuxo2(content, null));
        return Unit.INSTANCE;
    }
}
