package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1", m3645f = "OptionSideBySideChainTable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
    final /* synthetic */ boolean $isSelloutSnackbarDismissalExperimentEnabled;
    final /* synthetic */ ImmutableList<OptionLegBundle> $selectedLegs;
    final /* synthetic */ Function1<Instant, Unit> $showSelloutWarningSnackbar;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainTableViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1(OptionChainExpirationDateState optionChainExpirationDateState, boolean z, ImmutableList<OptionLegBundle> immutableList, Function1<? super Instant, Unit> function1, SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4, Continuation<? super OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1> continuation) {
        super(2, continuation);
        this.$expirationDateState = optionChainExpirationDateState;
        this.$isSelloutSnackbarDismissalExperimentEnabled = z;
        this.$selectedLegs = immutableList;
        this.$showSelloutWarningSnackbar = function1;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1(this.$expirationDateState, this.$isSelloutSnackbarDismissalExperimentEnabled, this.$selectedLegs, this.$showSelloutWarningSnackbar, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Instant selloutTimeWhenShouldShowSelloutWarningSnackbar = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getSelloutTimeWhenShouldShowSelloutWarningSnackbar();
            OptionChainExpirationDateState expirationDateState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getExpirationDateState();
            if (Intrinsics.areEqual(expirationDateState != null ? expirationDateState.getKey() : null, this.$expirationDateState.getKey()) && selloutTimeWhenShouldShowSelloutWarningSnackbar != null && (!this.$isSelloutSnackbarDismissalExperimentEnabled || this.$selectedLegs.isEmpty())) {
                this.$showSelloutWarningSnackbar.invoke(selloutTimeWhenShouldShowSelloutWarningSnackbar);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
