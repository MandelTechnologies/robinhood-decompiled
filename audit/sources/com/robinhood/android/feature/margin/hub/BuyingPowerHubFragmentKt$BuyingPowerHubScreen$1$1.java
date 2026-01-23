package com.robinhood.android.feature.margin.hub;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BuyingPowerHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1", m3645f = "BuyingPowerHubFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Event<BuyingPowerHubEvent>> $event$delegate;
    final /* synthetic */ Function1<GenericAlertContent<? extends GenericAction>, Unit> $presentAlert;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1(SnapshotState4<Event<BuyingPowerHubEvent>> snapshotState4, Function1<? super GenericAlertContent<? extends GenericAction>, Unit> function1, Continuation<? super BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1> continuation) {
        super(2, continuation);
        this.$event$delegate = snapshotState4;
        this.$presentAlert = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1(this.$event$delegate, this.$presentAlert, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventBuyingPowerHubScreen$lambda$0 = BuyingPowerHubFragmentKt.BuyingPowerHubScreen$lambda$0(this.$event$delegate);
            if (eventBuyingPowerHubScreen$lambda$0 != null) {
                final Function1<GenericAlertContent<? extends GenericAction>, Unit> function1 = this.$presentAlert;
                if ((eventBuyingPowerHubScreen$lambda$0.getData() instanceof BuyingPowerHubEvent.ShowOnboardingAlert) && (eventConsumer = (EventConsumer) eventBuyingPowerHubScreen$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventBuyingPowerHubScreen$lambda$0, new Function1() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragmentKt$BuyingPowerHubScreen$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m14489invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14489invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function1.invoke(((BuyingPowerHubEvent.ShowOnboardingAlert) eventBuyingPowerHubScreen$lambda$0.getData()).getOnboardingAlert().getAlert());
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
