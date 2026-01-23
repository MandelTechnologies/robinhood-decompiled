package com.robinhood.android.search.selector;

import com.robinhood.android.cortex.models.asset.AssetDigestPopularInstruments;
import com.robinhood.android.cortex.store.asset.AssetDigestPopularInstrumentsStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/cortex/models/asset/AssetDigestPopularInstruments$Item;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3", m3645f = "SearchSelectorDuxo.kt", m3646l = {144}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends AssetDigestPopularInstruments.Item>>, Object> {
    int label;
    final /* synthetic */ SearchSelectorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3(SearchSelectorDuxo searchSelectorDuxo, Continuation<? super SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3> continuation) {
        super(2, continuation);
        this.this$0 = searchSelectorDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AssetDigestPopularInstruments.Item>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<AssetDigestPopularInstruments.Item>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<AssetDigestPopularInstruments.Item>> continuation) {
        return ((SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore = this.this$0.assetDigestPopularInstrumentsStore;
            this.label = 1;
            obj = assetDigestPopularInstrumentsStore.getPopularInstruments(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((AssetDigestPopularInstruments) obj).getInstruments();
    }
}
