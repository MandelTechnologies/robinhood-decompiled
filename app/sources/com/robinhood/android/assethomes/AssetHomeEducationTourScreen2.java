package com.robinhood.android.assethomes;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.models.portfolio.AssetHomeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AssetHomeEducationTourScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$AssetHomeEducationTourScreen$2$1$1", m3645f = "AssetHomeEducationTourScreen.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.assethomes.AssetHomeEducationTourScreenKt$AssetHomeEducationTourScreen$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomeEducationTourScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetHomeState $assetHomeState;
    final /* synthetic */ String $elementId;
    final /* synthetic */ int $equitiesCount;
    final /* synthetic */ int $historyCount;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ int $optionsCount;
    final /* synthetic */ int $pendingEquitiesCount;
    final /* synthetic */ int $pendingOptionsCount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetHomeEducationTourScreen2(LazyListState lazyListState, AssetHomeState assetHomeState, int i, int i2, int i3, int i4, int i5, String str, Continuation<? super AssetHomeEducationTourScreen2> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$assetHomeState = assetHomeState;
        this.$pendingEquitiesCount = i;
        this.$equitiesCount = i2;
        this.$pendingOptionsCount = i3;
        this.$optionsCount = i4;
        this.$historyCount = i5;
        this.$elementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetHomeEducationTourScreen2(this.$lazyListState, this.$assetHomeState, this.$pendingEquitiesCount, this.$equitiesCount, this.$pendingOptionsCount, this.$optionsCount, this.$historyCount, this.$elementId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AssetHomeEducationTourScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            AssetHomeState assetHomeState = this.$assetHomeState;
            int i2 = this.$pendingEquitiesCount;
            int i3 = this.$equitiesCount;
            int i4 = this.$pendingOptionsCount;
            int i5 = this.$optionsCount;
            int i6 = this.$historyCount;
            String str = this.$elementId;
            this.label = 1;
            if (AssetHomeEducationTourScreen.onFocusAutoScroll(lazyListState, assetHomeState, i2, i3, i4, i5, i6, str, this) == coroutine_suspended) {
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
