package com.robinhood.shared.equities.instrumentdetail.p378ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnalystRatingsList.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$1$1", m3645f = "AnalystRatingsList.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsListKt$AnalystRatingsList$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class AnalystRatingsList2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ boolean $isDragging;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalystRatingsList2(boolean z, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super AnalystRatingsList2> continuation) {
        super(2, continuation);
        this.$isDragging = z;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnalystRatingsList2(this.$isDragging, this.$eventLogger, this.$eventDescriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnalystRatingsList2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isDragging) {
            EventLogger.DefaultImpls.logSwipe$default(this.$eventLogger, null, this.$eventDescriptor.getScreen(), new Component(Component.ComponentType.ANALYST_RATINGS_SECTION, null, null, 6, null), null, this.$eventDescriptor.getContext(), false, 41, null);
        }
        return Unit.INSTANCE;
    }
}
