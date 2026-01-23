package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeRewardsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource$CtaButton;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$primaryCtaResource$1", m3645f = "CryptoHomeRewardsDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$primaryCtaResource$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeRewardsDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductUpsellResource.CtaButton>, Object> {
    final /* synthetic */ ProductUpsellResource $resource;
    int label;
    final /* synthetic */ CryptoHomeRewardsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeRewardsDuxo3(CryptoHomeRewardsDuxo cryptoHomeRewardsDuxo, ProductUpsellResource productUpsellResource, Continuation<? super CryptoHomeRewardsDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeRewardsDuxo;
        this.$resource = productUpsellResource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHomeRewardsDuxo3(this.this$0, this.$resource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductUpsellResource.CtaButton> continuation) {
        return ((CryptoHomeRewardsDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            ResourceLink<EntryResource<ProductUpsellResource.CtaButton>> primaryCta = this.$resource.getPrimaryCta();
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, primaryCta, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((EntryResource) obj).getValue();
    }
}
