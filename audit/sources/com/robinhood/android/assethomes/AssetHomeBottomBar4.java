package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.assethomes.AssetHomeStateProvider3;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: AssetHomeBottomBar.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeBottomBarKt$AssetHomeBottomBar$1$1$2$1", m3645f = "AssetHomeBottomBar.kt", m3646l = {110}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.assethomes.AssetHomeBottomBarKt$AssetHomeBottomBar$1$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomeBottomBar4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Job> $actionJob;
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ AssetHomeViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetHomeBottomBar4(AssetHomeViewState assetHomeViewState, Navigator navigator, Context context, FragmentManager fragmentManager, Ref.ObjectRef<Job> objectRef, Continuation<? super AssetHomeBottomBar4> continuation) {
        super(2, continuation);
        this.$viewState = assetHomeViewState;
        this.$navigator = navigator;
        this.$context = context;
        this.$fragmentManager = fragmentManager;
        this.$actionJob = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetHomeBottomBar4(this.$viewState, this.$navigator, this.$context, this.$fragmentManager, this.$actionJob, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AssetHomeBottomBar4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AssetHomeStateProvider3 action = this.$viewState.getBottomBar().getAction();
            if (action instanceof AssetHomeStateProvider3.AssetHomeBottomBarActionUri) {
                boxing.boxBoolean(Navigator.DefaultImpls.handleDeepLink$default(this.$navigator, this.$context, ((AssetHomeStateProvider3.AssetHomeBottomBarActionUri) action).getUri(), null, null, false, null, 60, null));
            } else if (action instanceof AssetHomeStateProvider3.AssetHomeBottomBarActionFragmentKey) {
                if (this.$fragmentManager != null) {
                    Navigator.DefaultImpls.createDialogFragment$default(this.$navigator, ((AssetHomeStateProvider3.AssetHomeBottomBarActionFragmentKey) action).getDialogFragmentKey(), null, 2, null).show(this.$fragmentManager, (String) null);
                }
            } else if (action instanceof AssetHomeStateProvider3.AssetHomeBottomBarActionIntentKey) {
                Navigator.DefaultImpls.startActivity$default(this.$navigator, this.$context, ((AssetHomeStateProvider3.AssetHomeBottomBarActionIntentKey) action).getIntentKey(), null, false, null, null, 60, null);
            }
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$actionJob.element = null;
        return Unit.INSTANCE;
    }
}
