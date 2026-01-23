package com.robinhood.android.pathfinder.corepages.freetext;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FreeTextDescriptionInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1$4$1", m3645f = "FreeTextDescriptionInput.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1$4$1, reason: use source file name */
/* loaded from: classes11.dex */
final class FreeTextDescriptionInput3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $hasFocus$delegate;
    final /* synthetic */ UUID $inquiryId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreeTextDescriptionInput3(UserInteractionEventDescriptor userInteractionEventDescriptor, UUID uuid, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, Continuation<? super FreeTextDescriptionInput3> continuation) {
        super(2, continuation);
        this.$descriptor = userInteractionEventDescriptor;
        this.$inquiryId = uuid;
        this.$eventLogger = eventLogger;
        this.$hasFocus$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FreeTextDescriptionInput3(this.$descriptor, this.$inquiryId, this.$eventLogger, this.$hasFocus$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FreeTextDescriptionInput3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(this.$descriptor, FreeTextDescriptionInput.getInputFocusEventDescriptor(this.$inquiryId, FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$1(this.$hasFocus$delegate)));
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptorUpdateWith, UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        if (FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$1(this.$hasFocus$delegate)) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptorUpdateWith, UserInteractionEventData.EventType.TAP), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }
}
