package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
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

/* compiled from: AdvisoryFirstDepositTransferTypeSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment$ComposeContent$1$1", m3645f = "AdvisoryFirstDepositTransferTypeSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryFirstDepositTransferTypeSelectionFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Event<AdvisoryFundingMethodsEvent>> $event$delegate;
    int label;
    final /* synthetic */ AdvisoryFirstDepositTransferTypeSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryFirstDepositTransferTypeSelectionFragment2(AdvisoryFirstDepositTransferTypeSelectionFragment advisoryFirstDepositTransferTypeSelectionFragment, SnapshotState4<Event<AdvisoryFundingMethodsEvent>> snapshotState4, Continuation<? super AdvisoryFirstDepositTransferTypeSelectionFragment2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryFirstDepositTransferTypeSelectionFragment;
        this.$event$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryFirstDepositTransferTypeSelectionFragment2(this.this$0, this.$event$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryFirstDepositTransferTypeSelectionFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventComposeContent$lambda$1 = AdvisoryFirstDepositTransferTypeSelectionFragment.ComposeContent$lambda$1(this.$event$delegate);
            if (eventComposeContent$lambda$1 != null) {
                final AdvisoryFirstDepositTransferTypeSelectionFragment advisoryFirstDepositTransferTypeSelectionFragment = this.this$0;
                if ((eventComposeContent$lambda$1.getData() instanceof AdvisoryFundingMethodsEvent) && (eventConsumer = (EventConsumer) eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFirstDepositTransferTypeSelectionFragment$ComposeContent$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11060invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11060invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            advisoryFirstDepositTransferTypeSelectionFragment.handleEvent((AdvisoryFundingMethodsEvent) eventComposeContent$lambda$1.getData());
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
