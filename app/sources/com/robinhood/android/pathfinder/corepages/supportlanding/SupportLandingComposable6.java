package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportLandingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$SupportLandingScreen$2$1", m3645f = "SupportLandingComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingComposableKt$SupportLandingScreen$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class SupportLandingComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SupportLandingViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportLandingComposable6(SupportLandingViewState supportLandingViewState, EventLogger eventLogger, Continuation<? super SupportLandingComposable6> continuation) {
        super(2, continuation);
        this.$viewState = supportLandingViewState;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportLandingComposable6(this.$viewState, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportLandingComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String selectedAccountType = this.$viewState.getSelectedAccountType();
        if (selectedAccountType.length() <= 0) {
            selectedAccountType = null;
        }
        String str = selectedAccountType;
        if (str != null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE, null, str, null, 10, null), null, null, null, null, 61, null), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }
}
