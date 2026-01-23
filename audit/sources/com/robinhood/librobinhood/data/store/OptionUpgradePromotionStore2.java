package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiShouldShowOptionsUpgradeOnSdp;
import com.robinhood.models.p320db.ShouldShowOptionsUpgradeOnSdp;
import com.robinhood.models.p320db.ShouldShowOptionsUpgradeOnSdp2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionUpgradePromotionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/ShouldShowOptionsUpgradeOnSdp;", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$getShouldShowOptionsUpgradeOnSdp$1", m3645f = "OptionUpgradePromotionStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore$getShouldShowOptionsUpgradeOnSdp$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionUpgradePromotionStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends Boolean>, Continuation<? super ShouldShowOptionsUpgradeOnSdp>, Object> {
    final /* synthetic */ OptionsBonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionUpgradePromotionStore2(OptionsBonfireApi optionsBonfireApi, Continuation<? super OptionUpgradePromotionStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = optionsBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionUpgradePromotionStore2 optionUpgradePromotionStore2 = new OptionUpgradePromotionStore2(this.$bonfireApi, continuation);
        optionUpgradePromotionStore2.L$0 = obj;
        return optionUpgradePromotionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends Boolean> tuples2, Continuation<? super ShouldShowOptionsUpgradeOnSdp> continuation) {
        return invoke2((Tuples2<String, Boolean>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, Boolean> tuples2, Continuation<? super ShouldShowOptionsUpgradeOnSdp> continuation) {
        return ((OptionUpgradePromotionStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str2 = (String) tuples2.component1();
            Boolean bool = (Boolean) tuples2.component2();
            OptionsBonfireApi optionsBonfireApi = this.$bonfireApi;
            this.L$0 = str2;
            this.label = 1;
            obj = optionsBonfireApi.shouldShowOptionsUpgradeOnSdp(str2, bool, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return ShouldShowOptionsUpgradeOnSdp2.toDbModel((ApiShouldShowOptionsUpgradeOnSdp) obj, str);
    }
}
