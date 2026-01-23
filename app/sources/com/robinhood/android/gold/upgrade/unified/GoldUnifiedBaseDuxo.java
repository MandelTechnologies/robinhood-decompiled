package com.robinhood.android.gold.upgrade.unified;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldFlowScreen;
import gold_flow.proto.p466v1.GoldFlowService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: GoldUnifiedBaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedBaseDuxo;", "VS", "", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "initialViewState", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/udf/DuxoBundle;Ljava/lang/Object;)V", "goldFlowService", "Lgold_flow/proto/v1/GoldFlowService;", "getGoldFlowService", "()Lgold_flow/proto/v1/GoldFlowService;", "sendAction", "Lkotlinx/coroutines/Job;", "action", "Lgold_flow/proto/v1/Action;", "sendDeeplinkAction", "", "deeplinkUri", "", "screen", "Lgold_flow/proto/v1/GoldFlowScreen;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public class GoldUnifiedBaseDuxo<VS> extends BaseDuxo4<VS> {
    public static final int $stable = 8;
    private final GoldFlowService goldFlowService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUnifiedBaseDuxo(MicrogramManager microgramManager, DuxoBundle duxoBundle, VS initialViewState) {
        super(initialViewState, duxoBundle);
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(initialViewState, "initialViewState");
        this.goldFlowService = GoldUnifiedBaseDuxo3.getGoldFlowService(microgramManager, ViewModel2.getViewModelScope(this));
    }

    public final GoldFlowService getGoldFlowService() {
        return this.goldFlowService;
    }

    public final Job sendAction(Action action) {
        if (action != null) {
            return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new GoldUnifiedBaseDuxo2(this, action, null), 3, null);
        }
        return null;
    }

    /* compiled from: GoldUnifiedBaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo$sendDeeplinkAction$1", m3645f = "GoldUnifiedBaseDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo$sendDeeplinkAction$1 */
    static final class C181671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deeplinkUri;
        final /* synthetic */ GoldFlowScreen $screen;
        int label;
        final /* synthetic */ GoldUnifiedBaseDuxo<VS> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C181671(GoldUnifiedBaseDuxo<VS> goldUnifiedBaseDuxo, String str, GoldFlowScreen goldFlowScreen, Continuation<? super C181671> continuation) {
            super(2, continuation);
            this.this$0 = goldUnifiedBaseDuxo;
            this.$deeplinkUri = str;
            this.$screen = goldFlowScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C181671(this.this$0, this.$deeplinkUri, this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldFlowService goldFlowService = this.this$0.getGoldFlowService();
                String str = this.$deeplinkUri;
                GoldFlowScreen goldFlowScreen = this.$screen;
                this.label = 1;
                if (GoldUnifiedBaseDuxo3.sendDeeplinkAction(goldFlowService, str, goldFlowScreen, this) == coroutine_suspended) {
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

    public static /* synthetic */ void sendDeeplinkAction$default(GoldUnifiedBaseDuxo goldUnifiedBaseDuxo, String str, GoldFlowScreen goldFlowScreen, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDeeplinkAction");
        }
        if ((i & 2) != 0) {
            goldFlowScreen = null;
        }
        goldUnifiedBaseDuxo.sendDeeplinkAction(str, goldFlowScreen);
    }

    public final void sendDeeplinkAction(String deeplinkUri, GoldFlowScreen screen) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C181671(this, deeplinkUri, screen, null), 3, null);
    }
}
