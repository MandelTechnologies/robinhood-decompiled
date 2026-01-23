package com.robinhood.android.futures.assethome.educationtour;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.futures.assethome.FuturesAssetHomeViewState;
import futures_asset_home.proto.p462v1.SectionTypeDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAssetHomeEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt$FuturesAssetHomeEducationTourScreen$2$1$1", m3645f = "FuturesAssetHomeEducationTourScreen.kt", m3646l = {56}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreenKt$FuturesAssetHomeEducationTourScreen$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesAssetHomeEducationTourScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $elementId;
    final /* synthetic */ int $historyCount;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ int $pendingFuturesCount;
    final /* synthetic */ FuturesAssetHomeViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAssetHomeEducationTourScreen2(LazyListState lazyListState, FuturesAssetHomeViewState futuresAssetHomeViewState, int i, int i2, String str, Continuation<? super FuturesAssetHomeEducationTourScreen2> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$state = futuresAssetHomeViewState;
        this.$pendingFuturesCount = i;
        this.$historyCount = i2;
        this.$elementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAssetHomeEducationTourScreen2(this.$lazyListState, this.$state, this.$pendingFuturesCount, this.$historyCount, this.$elementId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAssetHomeEducationTourScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            ImmutableList<SectionTypeDto> assetHomeOrder = this.$state.getAssetHomeOrder();
            int i2 = this.$pendingFuturesCount;
            int i3 = this.$historyCount;
            String str = this.$elementId;
            this.label = 1;
            if (FuturesAssetHomeEducationTourScreen.onFocusAutoScroll(lazyListState, assetHomeOrder, i2, i3, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
