package com.plaid.link;

import com.plaid.internal.C5953R5;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.configuration.LinkTokenConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.plaid.link.Plaid$createWithoutPreload$1", m3645f = "Plaid.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
public final class Plaid$createWithoutPreload$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkTokenConfiguration $linkTokenConfiguration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$createWithoutPreload$1(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Plaid$createWithoutPreload$1> continuation) {
        super(2, continuation);
        this.$linkTokenConfiguration = linkTokenConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Plaid$createWithoutPreload$1(this.$linkTokenConfiguration, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Plaid plaid = Plaid.INSTANCE;
            LinkTokenConfiguration linkTokenConfiguration = this.$linkTokenConfiguration;
            this.label = 1;
            if (plaid.setLinkConfiguration(linkTokenConfiguration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("Link token configuration stored to disk", true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$createWithoutPreload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
