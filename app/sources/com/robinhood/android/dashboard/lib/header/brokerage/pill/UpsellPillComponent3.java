package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
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

/* compiled from: UpsellPillComponent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$2$1", m3645f = "UpsellPillComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class UpsellPillComponent3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ DashboardHeaderPillDuxo $duxo;
    final /* synthetic */ Context $localContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpsellPillComponent3(Context context, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, CoroutineScope coroutineScope, Continuation<? super UpsellPillComponent3> continuation) {
        super(2, continuation);
        this.$localContext = context;
        this.$duxo = dashboardHeaderPillDuxo;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpsellPillComponent3(this.$localContext, this.$duxo, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpsellPillComponent3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(this.$localContext);
        if (appCompatActivityFindActivityBaseContext != null && (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) != null) {
            this.$duxo.getDashboardPillManager().launchNavigationKeyWhenReceived(supportFragmentManager, this.$coroutineScope);
        }
        return Unit.INSTANCE;
    }
}
