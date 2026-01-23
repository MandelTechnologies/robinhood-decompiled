package com.google.accompanist.navigation.material;

import androidx.compose.runtime.ProduceState;
import androidx.navigation.NavBackStackEntry;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BottomSheetNavigator.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/navigation/NavBackStackEntry;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2", m3645f = "BottomSheetNavigator.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2, reason: use source file name */
/* loaded from: classes16.dex */
final class BottomSheetNavigator3 extends ContinuationImpl7 implements Function2<ProduceState<NavBackStackEntry>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomSheetNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetNavigator3(BottomSheetNavigator bottomSheetNavigator, Continuation<? super BottomSheetNavigator3> continuation) {
        super(2, continuation);
        this.this$0 = bottomSheetNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BottomSheetNavigator3 bottomSheetNavigator3 = new BottomSheetNavigator3(this.this$0, continuation);
        bottomSheetNavigator3.L$0 = obj;
        return bottomSheetNavigator3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceState<NavBackStackEntry> produceState, Continuation<? super Unit> continuation) {
        return ((BottomSheetNavigator3) create(produceState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProduceState produceState = (ProduceState) this.L$0;
            Flow flow = FlowKt.flow(new C4823xdaa5fc60(this.this$0.getBackStack(), null, this.this$0));
            FlowCollector flowCollector = new FlowCollector() { // from class: com.google.accompanist.navigation.material.BottomSheetNavigator$sheetContent$1$retainedEntry$2.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((NavBackStackEntry) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(NavBackStackEntry navBackStackEntry, Continuation<? super Unit> continuation) {
                    produceState.setValue(navBackStackEntry);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
