package com.robinhood.android.gold.upgrade.unified;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.moshi.LazyMoshi;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import timber.log.Timber;

/* compiled from: GoldUnifiedBaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedBaseEventDuxo;", "VS", "", "E", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "initialViewState", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;Ljava/lang/Object;)V", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "goldFlowService", "Lgold_flow/proto/v1/GoldFlowService;", "getGoldFlowService", "()Lgold_flow/proto/v1/GoldFlowService;", "microgramLaunchUi", "", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "microgramLaunchDialog", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "sendAction", "Lkotlinx/coroutines/Job;", "action", "Lgold_flow/proto/v1/Action;", "sendDeeplinkAction", "deeplinkUri", "", "screen", "Lgold_flow/proto/v1/GoldFlowScreen;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseEventDuxo, reason: use source file name */
/* loaded from: classes10.dex */
public class GoldUnifiedBaseDuxo4<VS, E> extends BaseDuxo5<VS, E> {
    public static final int $stable = 8;
    private final GoldFlowService goldFlowService;
    private final MicrogramComponent microgramComponent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUnifiedBaseDuxo4(MicrogramManager microgramManager, LazyMoshi moshi, DuxoBundle duxoBundle, VS initialViewState) {
        super(initialViewState, duxoBundle);
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(initialViewState, "initialViewState");
        MicrogramComponent componentWithUiLaunch$default = RealMicrogramUiLaunchService2.getComponentWithUiLaunch$default(microgramManager, new RemoteMicrogramApplication("app-gold-flow", null, 2, null), ViewModel2.getViewModelScope(this), moshi, null, new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseEventDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldUnifiedBaseDuxo4.microgramComponent$lambda$0(this.f$0, (FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseEventDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldUnifiedBaseDuxo4.microgramComponent$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        }, 8, null);
        this.microgramComponent = componentWithUiLaunch$default;
        this.goldFlowService = (GoldFlowService) componentWithUiLaunch$default.getServiceLocator().getClient(GoldFlowService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$0(GoldUnifiedBaseDuxo4 goldUnifiedBaseDuxo4, FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        goldUnifiedBaseDuxo4.microgramLaunchUi(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$1(GoldUnifiedBaseDuxo4 goldUnifiedBaseDuxo4, DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        goldUnifiedBaseDuxo4.microgramLaunchDialog(it);
        return Unit.INSTANCE;
    }

    public final GoldFlowService getGoldFlowService() {
        return this.goldFlowService;
    }

    public void microgramLaunchUi(FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Timber.INSTANCE.mo3350d("Request to launch fragment: " + fragmentKey, new Object[0]);
    }

    public void microgramLaunchDialog(DialogFragmentKey dialogFragmentKey) {
        Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
        Timber.INSTANCE.mo3350d("Request to launch dialog: " + dialogFragmentKey, new Object[0]);
    }

    public final Job sendAction(Action action) {
        if (action != null) {
            return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new GoldUnifiedBaseDuxo5(this, action, null), 3, null);
        }
        return null;
    }

    /* compiled from: GoldUnifiedBaseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseEventDuxo$sendDeeplinkAction$1", m3645f = "GoldUnifiedBaseDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseEventDuxo$sendDeeplinkAction$1 */
    static final class C181681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deeplinkUri;
        final /* synthetic */ GoldFlowScreen $screen;
        int label;
        final /* synthetic */ GoldUnifiedBaseDuxo4<VS, E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C181681(GoldUnifiedBaseDuxo4<VS, E> goldUnifiedBaseDuxo4, String str, GoldFlowScreen goldFlowScreen, Continuation<? super C181681> continuation) {
            super(2, continuation);
            this.this$0 = goldUnifiedBaseDuxo4;
            this.$deeplinkUri = str;
            this.$screen = goldFlowScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C181681(this.this$0, this.$deeplinkUri, this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    public static /* synthetic */ void sendDeeplinkAction$default(GoldUnifiedBaseDuxo4 goldUnifiedBaseDuxo4, String str, GoldFlowScreen goldFlowScreen, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDeeplinkAction");
        }
        if ((i & 2) != 0) {
            goldFlowScreen = null;
        }
        goldUnifiedBaseDuxo4.sendDeeplinkAction(str, goldFlowScreen);
    }

    public final void sendDeeplinkAction(String deeplinkUri, GoldFlowScreen screen) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C181681(this, deeplinkUri, screen, null), 3, null);
    }
}
