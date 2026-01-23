package com.robinhood.android.directdeposit.p101ui.p102v3;

import android.net.Uri;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositPerksViewState;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositPerksDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositPerksDuxo$onStart$2$1", m3645f = "DirectDepositPerksDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositPerksDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes27.dex */
final class DirectDepositPerksDuxo2 extends ContinuationImpl7 implements Function2<DirectDepositPerksViewState, Continuation<? super DirectDepositPerksViewState>, Object> {
    final /* synthetic */ ProductMarketingContent $content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositPerksDuxo2(ProductMarketingContent productMarketingContent, Continuation<? super DirectDepositPerksDuxo2> continuation) {
        super(2, continuation);
        this.$content = productMarketingContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectDepositPerksDuxo2(this.$content, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DirectDepositPerksViewState directDepositPerksViewState, Continuation<? super DirectDepositPerksViewState> continuation) {
        return ((DirectDepositPerksDuxo2) create(directDepositPerksViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String pageTitle = this.$content.getPageTitle();
        if (pageTitle == null) {
            pageTitle = "";
        }
        List<ProductMarketingContent.Feature> features = this.$content.getFeatures();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
        for (ProductMarketingContent.Feature feature : features) {
            arrayList.add(new TitleAndBody(feature.getTitle(), feature.getDescription().toString()));
        }
        return new DirectDepositPerksViewState.Loaded(pageTitle, arrayList, Uri.parse(String.valueOf(this.$content.getProductDescription())));
    }
}
