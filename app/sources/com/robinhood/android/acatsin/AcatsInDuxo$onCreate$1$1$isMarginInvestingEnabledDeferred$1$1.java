package com.robinhood.android.acatsin;

import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {1200}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes24.dex */
final class AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AvailableAccount $account;
    int label;
    final /* synthetic */ AcatsInDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1(AcatsInDuxo acatsInDuxo, AvailableAccount availableAccount, Continuation<? super AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1> continuation) {
        super(2, continuation);
        this.this$0 = acatsInDuxo;
        this.$account = availableAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1(this.this$0, this.$account, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Single singleFirst = this.this$0.marginSettingsStore.streamMarginSettings(this.$account.getRhsAccountNumber()).map(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(MarginSettings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isMarginInvestingEnabled());
            }
        }).first(boxing.boxBoolean(false));
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        this.label = 1;
        Object objAwait = RxAwait3.await(singleFirst, this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
