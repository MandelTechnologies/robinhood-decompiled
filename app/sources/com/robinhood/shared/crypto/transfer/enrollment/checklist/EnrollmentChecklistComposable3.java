package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EnrollmentChecklistComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt$EnrollmentChecklistComposable$3$1", m3645f = "EnrollmentChecklistComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt$EnrollmentChecklistComposable$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EnrollmentChecklistComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ EnrollmentChecklistV2ViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollmentChecklistComposable3(EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super EnrollmentChecklistComposable3> continuation) {
        super(2, continuation);
        this.$viewState = enrollmentChecklistV2ViewState;
        this.$eventLogger = eventLogger;
        this.$descriptor = userInteractionEventDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnrollmentChecklistComposable3(this.$viewState, this.$eventLogger, this.$descriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnrollmentChecklistComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String twoFactorRowLoggingIdentifier = this.$viewState.getTwoFactorRowLoggingIdentifier();
        if (twoFactorRowLoggingIdentifier != null) {
            EnrollmentChecklistComposable.logChecklistRowEvent(this.$eventLogger, this.$descriptor, twoFactorRowLoggingIdentifier, UserInteractionEventData.EventType.APPEAR);
        }
        return Unit.INSTANCE;
    }
}
