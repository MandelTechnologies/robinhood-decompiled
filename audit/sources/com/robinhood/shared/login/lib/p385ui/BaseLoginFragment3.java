package com.robinhood.shared.login.lib.p385ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.login.lib.p385ui.BaseLoginEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseLoginFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$5$1$1", m3645f = "BaseLoginFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.login.lib.ui.BaseLoginFragment$processEvent$5$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class BaseLoginFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseLoginEvent.ShowPasskeyBottomSheet $it;
    final /* synthetic */ String $webauthnOptions;
    int label;
    final /* synthetic */ BaseLoginFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLoginFragment3(BaseLoginFragment baseLoginFragment, String str, BaseLoginEvent.ShowPasskeyBottomSheet showPasskeyBottomSheet, Continuation<? super BaseLoginFragment3> continuation) {
        super(2, continuation);
        this.this$0 = baseLoginFragment;
        this.$webauthnOptions = str;
        this.$it = showPasskeyBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseLoginFragment3(this.this$0, this.$webauthnOptions, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseLoginFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BaseLoginFragment baseLoginFragment = this.this$0;
            String str = this.$webauthnOptions;
            UUID id = this.$it.getChallenge().getId();
            this.label = 1;
            if (baseLoginFragment.showPasskeyBottomSheet(str, id, this) == coroutine_suspended) {
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
