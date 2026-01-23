package com.robinhood.android.equities.equityscreener.crud.create;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerViewState;
import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateScreenerComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$2$1", m3645f = "CreateScreenerComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class CreateScreenerComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Screener, Unit> $onPresetSelected;
    final /* synthetic */ SnapshotState4<CreateScreenerViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CreateScreenerComposable4(Function1<? super Screener, Unit> function1, SnapshotState4<? extends CreateScreenerViewState> snapshotState4, Continuation<? super CreateScreenerComposable4> continuation) {
        super(2, continuation);
        this.$onPresetSelected = function1;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateScreenerComposable4(this.$onPresetSelected, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateScreenerComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (CreateScreenerComposable3.CreateScreenerComposable$lambda$3(this.$viewState$delegate) instanceof CreateScreenerViewState.Ready) {
                Function1<Screener, Unit> function1 = this.$onPresetSelected;
                CreateScreenerViewState createScreenerViewStateCreateScreenerComposable$lambda$3 = CreateScreenerComposable3.CreateScreenerComposable$lambda$3(this.$viewState$delegate);
                Intrinsics.checkNotNull(createScreenerViewStateCreateScreenerComposable$lambda$3, "null cannot be cast to non-null type com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerViewState.Ready");
                function1.invoke(CollectionsKt.first((List) ((CreateScreenerViewState.Ready) createScreenerViewStateCreateScreenerComposable$lambda$3).getPresets()));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
