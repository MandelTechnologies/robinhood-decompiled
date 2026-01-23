package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldBasicDownsellBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet$ComposeContent$1$1$1$1$1$1$1$1", m3645f = "GoldBasicDownsellBottomSheet.kt", m3646l = {136}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet$ComposeContent$1$1$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class GoldBasicDownsellBottomSheet3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $isLoading$delegate;
    final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;
    int label;
    final /* synthetic */ GoldBasicDownsellBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldBasicDownsellBottomSheet3(EventLogger eventLogger, GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super GoldBasicDownsellBottomSheet3> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.this$0 = goldBasicDownsellBottomSheet;
        this.$isLoading$delegate = snapshotState;
        this.$showErrorDialog$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldBasicDownsellBottomSheet3(this.$eventLogger, this.this$0, this.$isLoading$delegate, this.$showErrorDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldBasicDownsellBottomSheet3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objMo12620onAcceptDownsellIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Screen screen = new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET, null, null, 6, null);
            EventLogger.DefaultImpls.logTap$default(this.$eventLogger, UserInteractionEventData.Action.CONFIRM, screen, component, null, null, false, 56, null);
            GoldBasicDownsellBottomSheet.ComposeContent$lambda$2(this.$isLoading$delegate, true);
            GoldBasicDownsellBottomSheet.Callbacks callbacks = this.this$0.getCallbacks();
            this.label = 1;
            objMo12620onAcceptDownsellIoAF18A = callbacks.mo12620onAcceptDownsellIoAF18A(this);
            if (objMo12620onAcceptDownsellIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo12620onAcceptDownsellIoAF18A = ((Result) obj).getValue();
        }
        GoldBasicDownsellBottomSheet.ComposeContent$lambda$2(this.$isLoading$delegate, false);
        GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheet = this.this$0;
        SnapshotState<Boolean> snapshotState = this.$showErrorDialog$delegate;
        if (Result.m28553exceptionOrNullimpl(objMo12620onAcceptDownsellIoAF18A) != null) {
            GoldBasicDownsellBottomSheet.ComposeContent$lambda$5(snapshotState, true);
        } else {
            goldBasicDownsellBottomSheet.dismiss();
        }
        return Unit.INSTANCE;
    }
}
