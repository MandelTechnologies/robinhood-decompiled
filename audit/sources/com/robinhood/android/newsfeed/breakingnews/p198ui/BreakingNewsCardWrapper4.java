package com.robinhood.android.newsfeed.breakingnews.p198ui;

import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BreakingNewsCardWrapper.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$BreakingNewsCardWrapper$1$1", m3645f = "BreakingNewsCardWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardWrapperKt$BreakingNewsCardWrapper$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BreakingNewsCardWrapper4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $assetId;
    final /* synthetic */ ApiAssetType $assetType;
    final /* synthetic */ BreakingNewsCardWrapper $duxo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BreakingNewsCardWrapper4(BreakingNewsCardWrapper breakingNewsCardWrapper, String str, UUID uuid, ApiAssetType apiAssetType, Continuation<? super BreakingNewsCardWrapper4> continuation) {
        super(2, continuation);
        this.$duxo = breakingNewsCardWrapper;
        this.$accountNumber = str;
        this.$assetId = uuid;
        this.$assetType = apiAssetType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BreakingNewsCardWrapper4(this.$duxo, this.$accountNumber, this.$assetId, this.$assetType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BreakingNewsCardWrapper4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.loadBreakingNews(this.$accountNumber, this.$assetId, this.$assetType);
        return Unit.INSTANCE;
    }
}
