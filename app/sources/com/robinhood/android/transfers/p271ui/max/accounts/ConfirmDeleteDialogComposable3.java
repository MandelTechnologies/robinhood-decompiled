package com.robinhood.android.transfers.p271ui.max.accounts;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogEvent;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConfirmDeleteDialogComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$2$1", m3645f = "ConfirmDeleteDialogComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ConfirmDeleteDialogComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmDeleteDialogFragment.Callbacks $callbacks;
    final /* synthetic */ Function0<Unit> $dismiss;
    final /* synthetic */ SnapshotState4<Event<ConfirmDeleteDialogEvent>> $event$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDeleteDialogComposable3(SnapshotState4<Event<ConfirmDeleteDialogEvent>> snapshotState4, ConfirmDeleteDialogFragment.Callbacks callbacks, Function0<Unit> function0, Continuation<? super ConfirmDeleteDialogComposable3> continuation) {
        super(2, continuation);
        this.$event$delegate = snapshotState4;
        this.$callbacks = callbacks;
        this.$dismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfirmDeleteDialogComposable3(this.$event$delegate, this.$callbacks, this.$dismiss, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConfirmDeleteDialogComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        EventConsumer eventConsumer2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventConfirmDeleteDialogComposable$lambda$2 = ConfirmDeleteDialogComposable.ConfirmDeleteDialogComposable$lambda$2(this.$event$delegate);
            if (eventConfirmDeleteDialogComposable$lambda$2 != null) {
                final ConfirmDeleteDialogFragment.Callbacks callbacks = this.$callbacks;
                final Function0<Unit> function0 = this.$dismiss;
                if ((eventConfirmDeleteDialogComposable$lambda$2.getData() instanceof ConfirmDeleteDialogEvent.Success) && (eventConsumer2 = (EventConsumer) eventConfirmDeleteDialogComposable$lambda$2.getGetEventConsumer().invoke()) != null) {
                    eventConsumer2.consume(eventConfirmDeleteDialogComposable$lambda$2, new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$2$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m19836invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19836invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            callbacks.onAccountDeleted(((ConfirmDeleteDialogEvent.Success) eventConfirmDeleteDialogComposable$lambda$2.getData()).getAccountId());
                            function0.invoke();
                        }
                    });
                }
            }
            final Event eventConfirmDeleteDialogComposable$lambda$22 = ConfirmDeleteDialogComposable.ConfirmDeleteDialogComposable$lambda$2(this.$event$delegate);
            if (eventConfirmDeleteDialogComposable$lambda$22 != null) {
                final ConfirmDeleteDialogFragment.Callbacks callbacks2 = this.$callbacks;
                final Function0<Unit> function02 = this.$dismiss;
                if ((eventConfirmDeleteDialogComposable$lambda$22.getData() instanceof ConfirmDeleteDialogEvent.Error) && (eventConsumer = (EventConsumer) eventConfirmDeleteDialogComposable$lambda$22.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventConfirmDeleteDialogComposable$lambda$22, new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogComposableKt$ConfirmDeleteDialogComposable$2$1$invokeSuspend$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m19837invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19837invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            callbacks2.onAccountDeletionError(((ConfirmDeleteDialogEvent.Error) eventConfirmDeleteDialogComposable$lambda$22.getData()).getThrowable());
                            function02.invoke();
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
