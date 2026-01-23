package com.robinhood.android.gold.hub;

import androidx.fragment.app.FragmentManager;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$1$1", m3645f = "GoldHubFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldHubFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SduiActionHandler<GoldHubAction> $actionHandler;
    int label;
    final /* synthetic */ GoldHubFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GoldHubFragment2(GoldHubFragment goldHubFragment, SduiActionHandler<? super GoldHubAction> sduiActionHandler, Continuation<? super GoldHubFragment2> continuation) {
        super(2, continuation);
        this.this$0 = goldHubFragment;
        this.$actionHandler = sduiActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldHubFragment2(this.this$0, this.$actionHandler, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldHubFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GenericAlertContent<? extends GoldHubAction> bottomSheet = this.this$0.getBottomSheet();
            if (bottomSheet != null) {
                final GoldHubFragment goldHubFragment = this.this$0;
                SduiActionHandler<GoldHubAction> sduiActionHandler = this.$actionHandler;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                FragmentManager childFragmentManager = goldHubFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                sduiAlert.presentGoldHubAlertSheet(childFragmentManager, bottomSheet, sduiActionHandler, new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldHubFragment2.invokeSuspend$lambda$1$lambda$0(goldHubFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(GoldHubFragment goldHubFragment) {
        goldHubFragment.setBottomSheet(null);
        return Unit.INSTANCE;
    }
}
