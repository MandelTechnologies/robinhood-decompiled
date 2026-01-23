package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.runtime.SnapshotState4;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginMaintenanceTableComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$1$1", m3645f = "MarginMaintenanceTableComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginMaintenanceTableComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $isHeaderVisible$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $toggleAppBarTitle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MarginMaintenanceTableComposable4(Function1<? super Boolean, Unit> function1, SnapshotState4<Boolean> snapshotState4, Continuation<? super MarginMaintenanceTableComposable4> continuation) {
        super(2, continuation);
        this.$toggleAppBarTitle = function1;
        this.$isHeaderVisible$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginMaintenanceTableComposable4(this.$toggleAppBarTitle, this.$isHeaderVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginMaintenanceTableComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$toggleAppBarTitle.invoke(boxing.boxBoolean(!MarginMaintenanceTableComposable3.MarginMaintenanceTableComposable$lambda$4(this.$isHeaderVisible$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
