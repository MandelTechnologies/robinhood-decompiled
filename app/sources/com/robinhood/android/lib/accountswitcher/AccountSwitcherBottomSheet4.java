package com.robinhood.android.lib.accountswitcher;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta;
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

/* compiled from: AccountSwitcherBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$DeeplinkCtaButton$1$1$1", m3645f = "AccountSwitcherBottomSheet.kt", m3646l = {271}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheetKt$DeeplinkCtaButton$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class AccountSwitcherBottomSheet4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AccountSwitcherDeeplinkCta $deeplinkCta;
    final /* synthetic */ SnapshotState<Boolean> $loading$delegate;
    final /* synthetic */ Navigator $navigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSwitcherBottomSheet4(Navigator navigator, Context context, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, SnapshotState<Boolean> snapshotState, Continuation<? super AccountSwitcherBottomSheet4> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.$deeplinkCta = accountSwitcherDeeplinkCta;
        this.$loading$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSwitcherBottomSheet4(this.$navigator, this.$context, this.$deeplinkCta, this.$loading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSwitcherBottomSheet4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AccountSwitcherBottomSheet4 accountSwitcherBottomSheet4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSwitcherBottomSheet.DeeplinkCtaButton$lambda$8(this.$loading$delegate, true);
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            Uri uri = Uri.parse(this.$deeplinkCta.getUri());
            this.label = 1;
            accountSwitcherBottomSheet4 = this;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, null, accountSwitcherBottomSheet4, 28, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            accountSwitcherBottomSheet4 = this;
        }
        AccountSwitcherBottomSheet.DeeplinkCtaButton$lambda$8(accountSwitcherBottomSheet4.$loading$delegate, false);
        return Unit.INSTANCE;
    }
}
