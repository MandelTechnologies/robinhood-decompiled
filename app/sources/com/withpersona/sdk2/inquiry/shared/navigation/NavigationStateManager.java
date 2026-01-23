package com.withpersona.sdk2.inquiry.shared.navigation;

import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController;
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
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: NavigationStateManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "externalInquiryController", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;)V", "", "updateScreenState", "()V", "", "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "setState", "(ZZZ)V", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ExternalInquiryController;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Z", "isNavigationEnabled", "value", "isTransitioningBack", "()Z", "setTransitioningBack", "(Z)V", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NavigationStateManager {
    private final CoroutineScope coroutineScope;
    private final ExternalInquiryController externalInquiryController;
    private boolean isNavigationEnabled;
    private boolean isTransitioningBack;
    private final StateFlow2<NavigationState> navigationStateFlow;
    private boolean shouldShowBackButton;
    private boolean shouldShowCancelButton;

    public NavigationStateManager(ExternalInquiryController externalInquiryController) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        this.externalInquiryController = externalInquiryController;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
        this.navigationStateFlow = StateFlow4.MutableStateFlow(new NavigationState(true, true, externalInquiryController.isNavBarEnabled(), true, true));
        this.isNavigationEnabled = true;
    }

    public static /* synthetic */ void setState$default(NavigationStateManager navigationStateManager, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        navigationStateManager.setState(z, z2, z3);
    }

    public final void setState(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        updateScreenState();
    }

    public final NavigationState getNavigationState() {
        return this.navigationStateFlow.getValue();
    }

    public final void setTransitioningBack(boolean z) {
        this.isTransitioningBack = z;
        updateScreenState();
    }

    private final void updateScreenState() {
        NavigationState navigationState = new NavigationState(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.isNavBarEnabled(), this.externalInquiryController.getHandleBackPress(), this.isNavigationEnabled && !this.isTransitioningBack);
        if (Intrinsics.areEqual(this.navigationStateFlow.getValue(), navigationState)) {
            return;
        }
        this.navigationStateFlow.setValue(navigationState);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C437541(navigationState, null), 3, null);
    }

    /* compiled from: NavigationStateManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", m3645f = "NavigationStateManager.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1 */
    static final class C437541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavigationState $newNavigationState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437541(NavigationState navigationState, Continuation<? super C437541> continuation) {
            super(2, continuation);
            this.$newNavigationState = navigationState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NavigationStateManager.this.new C437541(this.$newNavigationState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<ScreenState> screenStateFlow = NavigationStateManager.this.externalInquiryController.getScreenStateFlow();
                ScreenState screenState = new ScreenState(this.$newNavigationState.getShowBackButton(), this.$newNavigationState.getShowCancelButton(), this.$newNavigationState.getIsNavigationEnabled());
                this.label = 1;
                if (screenStateFlow.emit(screenState, this) == coroutine_suspended) {
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
}
