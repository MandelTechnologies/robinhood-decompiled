package com.robinhood.android.equitytradeladder;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandler5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderSnackbarVisuals;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1$1$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderEventHandler5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityTradeLadderEvent.Snackbar $event;
    final /* synthetic */ SnapshotState<EquityTradeLadderEvent.Snackbar> $snackbarEvent$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderEventHandler5(SnackbarHostState snackbarHostState, EquityTradeLadderEvent.Snackbar snackbar, SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState, Continuation<? super EquityTradeLadderEventHandler5> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$event = snackbar;
        this.$snackbarEvent$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderEventHandler5 equityTradeLadderEventHandler5 = new EquityTradeLadderEventHandler5(this.$snackbarHostState, this.$event, this.$snackbarEvent$delegate, continuation);
        equityTradeLadderEventHandler5.L$0 = obj;
        return equityTradeLadderEventHandler5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderEventHandler5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SnackbarData currentSnackbarData = this.$snackbarHostState.getCurrentSnackbarData();
            if (currentSnackbarData != null) {
                currentSnackbarData.dismiss();
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$snackbarHostState, this.$event, this.$snackbarEvent$delegate, null), 3, null);
            this.label = 1;
            if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SnackbarData currentSnackbarData2 = this.$snackbarHostState.getCurrentSnackbarData();
        if (currentSnackbarData2 != null) {
            currentSnackbarData2.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderEventHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1$1$1$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {156}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityTradeLadderEvent.Snackbar $event;
        final /* synthetic */ SnapshotState<EquityTradeLadderEvent.Snackbar> $snackbarEvent$delegate;
        final /* synthetic */ SnackbarHostState $snackbarHostState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarHostState snackbarHostState, EquityTradeLadderEvent.Snackbar snackbar, SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$snackbarHostState = snackbarHostState;
            this.$event = snackbar;
            this.$snackbarEvent$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$snackbarHostState, this.$event, this.$snackbarEvent$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SnackbarHostState snackbarHostState = this.$snackbarHostState;
                ServerToBentoAssetMapper2 icon = this.$event.getIcon();
                StringResource msg = this.$event.getMsg();
                StringResource actionText = this.$event.getActionText();
                Function0<Unit> onActionClicked = this.$event.getOnActionClicked();
                boolean withDismissAction = this.$event.getWithDismissAction();
                final SnackbarHostState snackbarHostState2 = this.$snackbarHostState;
                final SnapshotState<EquityTradeLadderEvent.Snackbar> snapshotState = this.$snackbarEvent$delegate;
                LadderSnackbarVisuals ladderSnackbarVisuals = new LadderSnackbarVisuals(icon, msg, actionText, onActionClicked, new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$15$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderEventHandler5.AnonymousClass1.invokeSuspend$lambda$0(snackbarHostState2, snapshotState);
                    }
                }, null, withDismissAction, 32, null);
                this.label = 1;
                if (snackbarHostState.showSnackbar(ladderSnackbarVisuals, this) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$0(SnackbarHostState snackbarHostState, SnapshotState snapshotState) {
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            if (currentSnackbarData != null) {
                currentSnackbarData.dismiss();
            }
            snapshotState.setValue(null);
            return Unit.INSTANCE;
        }
    }
}
