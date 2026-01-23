package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: ExternalEventLogger.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalEventLogger;", "", "externalInquiryController", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentPage", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/InquiryPage;", "logEvent", "", "inquiryEvent", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "logPageChange", "page", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ExternalEventLogger {
    private final CoroutineScope coroutineScope;
    private InquiryPage currentPage;
    private final ExternalInquiryController externalInquiryController;

    public ExternalEventLogger(ExternalInquiryController externalInquiryController) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        this.externalInquiryController = externalInquiryController;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    /* compiled from: ExternalEventLogger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger$logEvent$1", m3645f = "ExternalEventLogger.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger$logEvent$1 */
    static final class C437521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InquiryEvent $inquiryEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437521(InquiryEvent inquiryEvent, Continuation<? super C437521> continuation) {
            super(2, continuation);
            this.$inquiryEvent = inquiryEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExternalEventLogger.this.new C437521(this.$inquiryEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2<InquiryEvent> eventFlow = ExternalEventLogger.this.externalInquiryController.getEventFlow();
                InquiryEvent inquiryEvent = this.$inquiryEvent;
                this.label = 1;
                if (eventFlow.emit(inquiryEvent, this) == coroutine_suspended) {
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

    public final void logEvent(InquiryEvent inquiryEvent) {
        Intrinsics.checkNotNullParameter(inquiryEvent, "inquiryEvent");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C437521(inquiryEvent, null), 3, null);
    }

    public final void logPageChange(InquiryPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.areEqual(this.currentPage, page)) {
            return;
        }
        this.currentPage = page;
        logEvent(new InquiryEvent.PageChange(page.getStepName(), page.toString()));
    }
}
