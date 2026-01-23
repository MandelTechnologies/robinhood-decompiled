package com.robinhood.shared.stepupverification.identityverification;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$shouldPoll$1", m3645f = "LoggedInIdentityVerificationWaitFragment.kt", m3646l = {61, 62, 75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$shouldPoll$1, reason: use source file name */
/* loaded from: classes6.dex */
final class LoggedInIdentityVerificationWaitFragment2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoggedInIdentityVerificationWaitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggedInIdentityVerificationWaitFragment2(LoggedInIdentityVerificationWaitFragment loggedInIdentityVerificationWaitFragment, Continuation<? super LoggedInIdentityVerificationWaitFragment2> continuation) {
        super(2, continuation);
        this.this$0 = loggedInIdentityVerificationWaitFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoggedInIdentityVerificationWaitFragment2 loggedInIdentityVerificationWaitFragment2 = new LoggedInIdentityVerificationWaitFragment2(this.this$0, continuation);
        loggedInIdentityVerificationWaitFragment2.L$0 = obj;
        return loggedInIdentityVerificationWaitFragment2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((LoggedInIdentityVerificationWaitFragment2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (r1.emit(r13, r12) != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Boolean boolBoxBoolean = boxing.boxBoolean(true);
            this.L$0 = flowCollector2;
            this.label = 1;
            if (flowCollector2.emit(boolBoxBoolean, this) != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            EventLogger.DefaultImpls.logAppear$default(this.this$0.getEventLogger(), null, this.this$0.getEventScreen(), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, null, 25, null);
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C20366R.string.verification_timeout_dialog_title, new Object[0]).setMessage(C20366R.string.verification_timeout_dialog_message, new Object[0]).setPositiveButton(C20366R.string.verification_timeout_dialog_cta_text, new Object[0]);
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "timeout-dialog", false, 4, null);
            Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
            this.L$0 = null;
            this.label = 3;
        }
        this.L$0 = flowCollector;
        this.label = 2;
        if (DelayKt.delay(240000L, this) != coroutine_suspended) {
            EventLogger.DefaultImpls.logAppear$default(this.this$0.getEventLogger(), null, this.this$0.getEventScreen(), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, null, 25, null);
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            Context contextRequireContext2 = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RhDialogFragment.Builder positiveButton2 = companion2.create(contextRequireContext2).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C20366R.string.verification_timeout_dialog_title, new Object[0]).setMessage(C20366R.string.verification_timeout_dialog_message, new Object[0]).setPositiveButton(C20366R.string.verification_timeout_dialog_cta_text, new Object[0]);
            FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton2, childFragmentManager2, "timeout-dialog", false, 4, null);
            Boolean boolBoxBoolean22 = boxing.boxBoolean(false);
            this.L$0 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
