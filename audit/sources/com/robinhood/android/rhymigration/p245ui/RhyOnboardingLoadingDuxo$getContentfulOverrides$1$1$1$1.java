package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super EntryResource<ProductMarketing.Feature>>, Object> {
    final /* synthetic */ ResourceLink<EntryResource<ProductMarketing.Feature>> $it;
    int label;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, ResourceLink<EntryResource<ProductMarketing.Feature>> resourceLink, Continuation<? super RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
        this.$it = resourceLink;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EntryResource<ProductMarketing.Feature>> continuation) {
        return ((RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        StaticContentStore staticContentStore = this.this$0.staticContentStore;
        ResourceLink<EntryResource<ProductMarketing.Feature>> resourceLink = this.$it;
        this.label = 1;
        Object objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
        return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
    }
}
