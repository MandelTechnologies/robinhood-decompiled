package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1", m3645f = "AccountSelectorTabsRow.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ Function1<Integer, Unit> $onTabSpacingMeasured;
    final /* synthetic */ float $tabSpacing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1(Density density, Function1<? super Integer, Unit> function1, float f, Continuation<? super AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1> continuation) {
        super(2, continuation);
        this.$density = density;
        this.$onTabSpacingMeasured = function1;
        this.$tabSpacing = f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1(this.$density, this.$onTabSpacingMeasured, this.$tabSpacing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorTabsRowKt$AccountSelectorTabsRow$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onTabSpacingMeasured.invoke(boxing.boxInt(this.$density.mo5010roundToPx0680j_4(this.$tabSpacing)));
        return Unit.INSTANCE;
    }
}
