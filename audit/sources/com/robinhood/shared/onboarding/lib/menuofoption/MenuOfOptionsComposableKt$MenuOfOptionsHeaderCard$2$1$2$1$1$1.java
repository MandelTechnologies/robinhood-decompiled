package com.robinhood.shared.onboarding.lib.menuofoption;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.identi.ApiMenuOfOptionsHeaderCard;
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

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1", m3645f = "MenuOfOptionsComposable.kt", m3646l = {351}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes6.dex */
final class MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ApiMenuOfOptionsHeaderCard $headerCard;
    final /* synthetic */ Navigator $navigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1(Navigator navigator, Context context, ApiMenuOfOptionsHeaderCard apiMenuOfOptionsHeaderCard, Continuation<? super MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.$headerCard = apiMenuOfOptionsHeaderCard;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1(this.$navigator, this.$context, this.$headerCard, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MenuOfOptionsComposableKt$MenuOfOptionsHeaderCard$2$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            Uri uri = Uri.parse(this.$headerCard.getCtaDeeplink());
            this.label = 1;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, null, this, 28, null) == coroutine_suspended) {
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
