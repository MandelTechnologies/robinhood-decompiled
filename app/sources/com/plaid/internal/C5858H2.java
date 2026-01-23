package com.plaid.internal;

import android.content.Intent;
import com.plaid.internal.AbstractC7207s6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.link.LinkActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", m3645f = "LinkRedirectActivityViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.H2 */
/* loaded from: classes16.dex */
public final class C5858H2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ LinkRedirectActivity f1361a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7207s6 f1362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5858H2(LinkRedirectActivity linkRedirectActivity, AbstractC7207s6 abstractC7207s6, Continuation continuation) {
        super(2, continuation);
        this.f1361a = linkRedirectActivity;
        this.f1362b = abstractC7207s6;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5858H2(this.f1361a, this.f1362b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5858H2(this.f1361a, this.f1362b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("Launching LinkActivity", true);
        LinkRedirectActivity context = this.f1361a;
        int i = LinkActivity.f2928e;
        AbstractC7207s6 state = this.f1362b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(state, "redirectState");
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(603979776);
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AbstractC7207s6.a) {
            intent.putExtra("link_oauth_redirect", true);
            intent.putExtra("link_oauth_received_redirect_uri", ((AbstractC7207s6.a) state).f3205a);
        } else if (state instanceof AbstractC7207s6.b) {
            intent.putExtra("link_out_of_process_complete_redirect", true);
            intent.putExtra("link_out_of_process_complete_redirect_uri", ((AbstractC7207s6.b) state).f3206a);
        } else if (state instanceof AbstractC7207s6.d) {
            intent.putExtra("redirect_error", true);
            intent.putExtra("redirect_error_exception", ((AbstractC7207s6.d) state).f3207a);
        } else if (state instanceof AbstractC7207s6.e) {
            intent.putExtra("link_resume_redirect", true);
        }
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
