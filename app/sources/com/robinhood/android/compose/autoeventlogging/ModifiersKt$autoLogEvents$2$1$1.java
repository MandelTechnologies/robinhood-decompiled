package com.robinhood.android.compose.autoeventlogging;

import android.os.Build;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1", m3645f = "Modifiers.kt", m3646l = {114}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes17.dex */
final class ModifiersKt$autoLogEvents$2$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $appearEventDebounceTimeOverrideForTesting;
    final /* synthetic */ UserInteractionEventDescriptor $currentEventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $hasLoggedAppearButNotDisappear$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isVisible$delegate;
    final /* synthetic */ boolean $logAppear;
    final /* synthetic */ boolean $useTransitionEventTypes;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifiersKt$autoLogEvents$2$1$1(Long l, boolean z, SnapshotState<Boolean> snapshotState, boolean z2, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState2, Continuation<? super ModifiersKt$autoLogEvents$2$1$1> continuation) {
        super(2, continuation);
        this.$appearEventDebounceTimeOverrideForTesting = l;
        this.$logAppear = z;
        this.$isVisible$delegate = snapshotState;
        this.$useTransitionEventTypes = z2;
        this.$eventLogger = eventLogger;
        this.$currentEventDescriptor = userInteractionEventDescriptor;
        this.$hasLoggedAppearButNotDisappear$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifiersKt$autoLogEvents$2$1$1(this.$appearEventDebounceTimeOverrideForTesting, this.$logAppear, this.$isVisible$delegate, this.$useTransitionEventTypes, this.$eventLogger, this.$currentEventDescriptor, this.$hasLoggedAppearButNotDisappear$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifiersKt$autoLogEvents$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual("robolectric", Build.FINGERPRINT);
            final boolean z = this.$logAppear;
            final SnapshotState<Boolean> snapshotState = this.$isVisible$delegate;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(ModifiersKt$autoLogEvents$2$1$1.invokeSuspend$lambda$0(z, snapshotState));
                }
            }));
            Long l = this.$appearEventDebounceTimeOverrideForTesting;
            final Flow flowDebounce = FlowKt.debounce(flowDistinctUntilChanged, l != null ? l.longValue() : zAreEqual ? 0L : 500L);
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowDebounce.collect(new C119202(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1$invokeSuspend$$inlined$filter$1$2 */
                public static final class C119202<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "Modifiers.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C119202.this.emit(null, this);
                        }
                    }

                    public C119202(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((Boolean) obj).booleanValue()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            final boolean z2 = this.$useTransitionEventTypes;
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$currentEventDescriptor;
            final SnapshotState<Boolean> snapshotState2 = this.$hasLoggedAppearButNotDisappear$delegate;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.android.compose.autoeventlogging.ModifiersKt$autoLogEvents$2$1$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z3, Continuation<? super Unit> continuation) {
                    UserInteractionEventData.EventType eventType;
                    if (z2) {
                        eventType = UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR;
                    } else {
                        eventType = UserInteractionEventData.EventType.APPEAR;
                    }
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, eventType), false, false, 6, null);
                    ModifiersKt.C119232.invoke$lambda$11(snapshotState2, true);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z, SnapshotState snapshotState) {
        return z && ModifiersKt.C119232.invoke$lambda$1(snapshotState);
    }
}
