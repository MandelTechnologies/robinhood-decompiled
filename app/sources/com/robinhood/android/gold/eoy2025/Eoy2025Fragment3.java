package com.robinhood.android.gold.eoy2025;

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

/* compiled from: Eoy2025Fragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$1$1", m3645f = "Eoy2025Fragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class Eoy2025Fragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $localContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Eoy2025Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Eoy2025Fragment3(Context context, Eoy2025Fragment eoy2025Fragment, Continuation<? super Eoy2025Fragment3> continuation) {
        super(2, continuation);
        this.$localContext = context;
        this.this$0 = eoy2025Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Eoy2025Fragment3 eoy2025Fragment3 = new Eoy2025Fragment3(this.$localContext, this.this$0, continuation);
        eoy2025Fragment3.L$0 = obj;
        return eoy2025Fragment3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Eoy2025Fragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(this.$localContext);
        if (appCompatActivityFindActivityBaseContext != null && (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) != null) {
            this.this$0.getDuxo().getEoyGiveawayManager().launchNavigationKeyWhenReceived(supportFragmentManager, coroutineScope);
        }
        return Unit.INSTANCE;
    }
}
