package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$6$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$6$1 */
/* loaded from: classes11.dex */
final class C24194x482255a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
    final /* synthetic */ OptionChainBottomSheetScaffoldDuxo $duxo;
    final /* synthetic */ SnapshotState4<Event<OptionChainBottomSheetScaffoldEvent>> $event$delegate;
    final /* synthetic */ float $nuxDistance;
    final /* synthetic */ SnapshotState<OptionChainBottomSheetState> $optionChainBottomSheetState$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $shouldShowBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24194x482255a(boolean z, SnapshotState<OptionChainBottomSheetState> snapshotState, SnapshotState4<Event<OptionChainBottomSheetScaffoldEvent>> snapshotState4, CoroutineScope coroutineScope, float f, OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo, SnapshotState4<MultiModeSheetState> snapshotState42, Continuation<? super C24194x482255a> continuation) {
        super(2, continuation);
        this.$shouldShowBottomSheet = z;
        this.$optionChainBottomSheetState$delegate = snapshotState;
        this.$event$delegate = snapshotState4;
        this.$scope = coroutineScope;
        this.$nuxDistance = f;
        this.$duxo = optionChainBottomSheetScaffoldDuxo;
        this.$bottomSheetState$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24194x482255a(this.$shouldShowBottomSheet, this.$optionChainBottomSheetState$delegate, this.$event$delegate, this.$scope, this.$nuxDistance, this.$duxo, this.$bottomSheetState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24194x482255a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$shouldShowBottomSheet && OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$33(this.$optionChainBottomSheetState$delegate) == OptionChainBottomSheetState.READY) {
            final Event eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$0(this.$event$delegate);
            if (eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0 != null) {
                final CoroutineScope coroutineScope = this.$scope;
                final float f = this.$nuxDistance;
                final OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo = this.$duxo;
                final SnapshotState4<MultiModeSheetState> snapshotState4 = this.$bottomSheetState$delegate;
                if ((eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0.getData() instanceof OptionChainBottomSheetScaffoldEvent.StartNuxAnimationScaffoldEvent) && (eventConsumer = (EventConsumer) eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventOptionChainBottomSheetScaffold_TCVpFMg$lambda$0, new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$6$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m17159invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17159invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24195x1ed0234(f, optionChainBottomSheetScaffoldDuxo, snapshotState4, null), 3, null);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
