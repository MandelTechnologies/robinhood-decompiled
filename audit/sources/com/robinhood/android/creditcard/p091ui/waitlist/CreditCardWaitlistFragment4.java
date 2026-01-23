package com.robinhood.android.creditcard.p091ui.waitlist;

import androidx.compose.runtime.SnapshotState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle3;
import androidx.lifecycle.LifecycleOwner;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreditCardWaitlistFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$1$1", m3645f = "CreditCardWaitlistFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CreditCardWaitlistFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Lifecycle.Event> $currentLifecycleValue$delegate;
    final /* synthetic */ LifecycleOwner $owner;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardWaitlistFragment4(LifecycleOwner lifecycleOwner, SnapshotState<Lifecycle.Event> snapshotState, Continuation<? super CreditCardWaitlistFragment4> continuation) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.$currentLifecycleValue$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardWaitlistFragment4(this.$owner, this.$currentLifecycleValue$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditCardWaitlistFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Lifecycle.Event> eventFlow = Lifecycle3.getEventFlow(this.$owner.getLifecycle());
            C126701 c126701 = new C126701(this.$currentLifecycleValue$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(eventFlow, c126701, this) == coroutine_suspended) {
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

    /* compiled from: CreditCardWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Landroidx/lifecycle/Lifecycle$Event;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$1$1$1", m3645f = "CreditCardWaitlistFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$1$1$1 */
    static final class C126701 extends ContinuationImpl7 implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Lifecycle.Event> $currentLifecycleValue$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126701(SnapshotState<Lifecycle.Event> snapshotState, Continuation<? super C126701> continuation) {
            super(2, continuation);
            this.$currentLifecycleValue$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126701 c126701 = new C126701(this.$currentLifecycleValue$delegate, continuation);
            c126701.L$0 = obj;
            return c126701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
            return ((C126701) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$currentLifecycleValue$delegate.setValue((Lifecycle.Event) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
