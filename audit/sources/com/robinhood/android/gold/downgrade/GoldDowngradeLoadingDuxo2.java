package com.robinhood.android.gold.downgrade;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldDowngradeLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1$confirmationAsync$1", m3645f = "GoldDowngradeLoadingDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingDuxo$onStart$1$confirmationAsync$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDowngradeLoadingDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OtherMarkdown>, Object> {
    int label;
    final /* synthetic */ GoldDowngradeLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDowngradeLoadingDuxo2(GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxo, Continuation<? super GoldDowngradeLoadingDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = goldDowngradeLoadingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldDowngradeLoadingDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OtherMarkdown> continuation) {
        return ((GoldDowngradeLoadingDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            this.label = 1;
            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, "3mGqfdGjnMGEufxXd1RHLt", null, this, 2, null);
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
