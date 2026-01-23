package com.robinhood.android.pathfinder.corepages.freetext;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FreeTextDescriptionInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1$5$1", m3645f = "FreeTextDescriptionInput.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1$5$1, reason: use source file name */
/* loaded from: classes11.dex */
final class FreeTextDescriptionInput4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ UUID $inquiryId;
    final /* synthetic */ boolean $isAboveLimit;
    final /* synthetic */ SnapshotState<Boolean> $isCounterTextVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreeTextDescriptionInput4(UserInteractionEventDescriptor userInteractionEventDescriptor, UUID uuid, boolean z, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, Continuation<? super FreeTextDescriptionInput4> continuation) {
        super(2, continuation);
        this.$descriptor = userInteractionEventDescriptor;
        this.$inquiryId = uuid;
        this.$isAboveLimit = z;
        this.$eventLogger = eventLogger;
        this.$isCounterTextVisible$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FreeTextDescriptionInput4(this.$descriptor, this.$inquiryId, this.$isAboveLimit, this.$eventLogger, this.$isCounterTextVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FreeTextDescriptionInput4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UserInteractionEventData.EventType eventType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
        Component component = new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null);
        String string2 = this.$inquiryId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, this.$isAboveLimit ? "error" : "warning", null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388542, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 39, null));
        if (FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$4(this.$isCounterTextVisible$delegate)) {
            eventType = UserInteractionEventData.EventType.APPEAR;
        } else {
            eventType = UserInteractionEventData.EventType.DISAPPEAR;
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptorUpdateWith, eventType), false, false, 6, null);
        return Unit.INSTANCE;
    }
}
