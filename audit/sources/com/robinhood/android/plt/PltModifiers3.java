package com.robinhood.android.plt;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.android.plt.contract.PltManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PltModifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$2$1", m3645f = "PltModifiers.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PltModifiers3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $currentIsLoading$delegate;
    final /* synthetic */ SnapshotState<Boolean> $hasLoggedAppearButNotDisappear$delegate;
    final /* synthetic */ String $identifier;
    final /* synthetic */ SnapshotState<Boolean> $isVisible$delegate;
    final /* synthetic */ PltManager $pltManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PltModifiers3(SnapshotState4<Boolean> snapshotState4, SnapshotState<Boolean> snapshotState, PltManager pltManager, String str, SnapshotState<Boolean> snapshotState2, Continuation<? super PltModifiers3> continuation) {
        super(2, continuation);
        this.$currentIsLoading$delegate = snapshotState4;
        this.$isVisible$delegate = snapshotState;
        this.$pltManager = pltManager;
        this.$identifier = str;
        this.$hasLoggedAppearButNotDisappear$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PltModifiers3(this.$currentIsLoading$delegate, this.$isVisible$delegate, this.$pltManager, this.$identifier, this.$hasLoggedAppearButNotDisappear$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PltModifiers3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final SnapshotState4<Boolean> snapshotState4 = this.$currentIsLoading$delegate;
            final SnapshotState<Boolean> snapshotState = this.$isVisible$delegate;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(PltModifiers3.invokeSuspend$lambda$0(snapshotState4, snapshotState));
                }
            }));
            final PltManager pltManager = this.$pltManager;
            final String str = this.$identifier;
            final SnapshotState<Boolean> snapshotState2 = this.$hasLoggedAppearButNotDisappear$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.plt.PltModifiersKt$recordLoadingState$1$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (!z) {
                        if (PltModifiers.C255431.invoke$lambda$1(snapshotState2)) {
                            pltManager.onElementLoadEnded(str);
                            PltModifiers.C255431.invoke$lambda$2(snapshotState2, false);
                        }
                    } else {
                        pltManager.onElementLoadStarted(str);
                        PltModifiers.C255431.invoke$lambda$2(snapshotState2, true);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(SnapshotState4 snapshotState4, SnapshotState snapshotState) {
        return PltModifiers.C255431.invoke$lambda$6(snapshotState4) && PltModifiers.C255431.invoke$lambda$4(snapshotState);
    }
}
