package com.robinhood.android.equitytradeladder;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$8$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$8$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderEventHandler6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState<EquityTradeLadderEvent.ServerDrivenAlert> $serverDrivenAlert$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderEventHandler6(SnapshotState<EquityTradeLadderEvent.ServerDrivenAlert> snapshotState, Context context, Navigator navigator, Continuation<? super EquityTradeLadderEventHandler6> continuation) {
        super(2, continuation);
        this.$serverDrivenAlert$delegate = snapshotState;
        this.$context = context;
        this.$navigator = navigator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderEventHandler6(this.$serverDrivenAlert$delegate, this.$context, this.$navigator, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderEventHandler6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderEvent.ServerDrivenAlert serverDrivenAlertEquityTradeLadderEventHandler$lambda$10 = EquityTradeLadderEventHandler.EquityTradeLadderEventHandler$lambda$10(this.$serverDrivenAlert$delegate);
            if (serverDrivenAlertEquityTradeLadderEventHandler$lambda$10 != null) {
                Context context = this.$context;
                Navigator navigator = this.$navigator;
                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext != null ? appCompatActivityFindActivityBaseContext.getSupportFragmentManager() : null;
                if (supportFragmentManager != null) {
                    Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ClientComponentAlert(serverDrivenAlertEquityTradeLadderEventHandler$lambda$10.getAlert(), false, false, 6, null), null, 2, null).show(supportFragmentManager, "pdt-warning-equities");
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
