package defpackage;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferEvent;
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

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$3$1", m3645f = "AdvisoryFirstDepositTransferComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$3$1 */
/* loaded from: classes24.dex */
final class C0035x96ead06c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Event<AdvisoryFirstDepositTransferEvent>> $event$delegate;
    final /* synthetic */ Function0<Unit> $onPushToAgreements;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0035x96ead06c(SnapshotState4<Event<AdvisoryFirstDepositTransferEvent>> snapshotState4, Function0<Unit> function0, Continuation<? super C0035x96ead06c> continuation) {
        super(2, continuation);
        this.$event$delegate = snapshotState4;
        this.$onPushToAgreements = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0035x96ead06c(this.$event$delegate, this.$onPushToAgreements, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C0035x96ead06c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventAdvisoryFirstDepositComposable$lambda$1 = AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$1(this.$event$delegate);
            if (eventAdvisoryFirstDepositComposable$lambda$1 != null) {
                final Function0<Unit> function0 = this.$onPushToAgreements;
                if ((eventAdvisoryFirstDepositComposable$lambda$1.getData() instanceof AdvisoryFirstDepositTransferEvent.SignAgreements) && (eventConsumer = (EventConsumer) eventAdvisoryFirstDepositComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventAdvisoryFirstDepositComposable$lambda$1, new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$3$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m4305invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m4305invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function0.invoke();
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
