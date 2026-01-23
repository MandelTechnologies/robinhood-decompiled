package com.robinhood.security.screenprotect;

import android.app.Activity;
import android.content.Context;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.security.contracts.ScreenProtectFragmentKey;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: ScreenProtectManager.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\n\u0010\u0014\u001a\u00020\u000f*\u00020\u0015J\n\u0010\u0016\u001a\u00020\u000f*\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "enabled", "", "getEnabled", "()Z", "blockScreenSharing", "", "context", "Landroid/content/Context;", "flow", "Lcom/robinhood/security/screenprotect/ScreenProtectFlow;", "setFlagSecure", "Landroid/app/Activity;", "clearFlagSecure", "lib-security_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public class ScreenProtectManager {
    private final CoroutineScope coroutineScope;
    private final ExperimentsStore experimentsStore;
    private final Navigator navigator;

    public boolean getEnabled() {
        return true;
    }

    public ScreenProtectManager(@RootCoroutineScope CoroutineScope coroutineScope, Navigator navigator, ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.coroutineScope = coroutineScope;
        this.navigator = navigator;
        this.experimentsStore = experimentsStore;
    }

    /* compiled from: ScreenProtectManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.security.screenprotect.ScreenProtectManager$blockScreenSharing$1", m3645f = "ScreenProtectManager.kt", m3646l = {76}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.security.screenprotect.ScreenProtectManager$blockScreenSharing$1 */
    static final class C372931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ScreenProtectFlow $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C372931(Context context, ScreenProtectFlow screenProtectFlow, Continuation<? super C372931> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$flow = screenProtectFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenProtectManager.this.new C372931(this.$context, this.$flow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C372931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(ScreenProtectManager.this.experimentsStore, new Experiment[]{ScreenProtectAllowList.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamState$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            if (ScreenProtectManager.this.getEnabled() && !bool.booleanValue() && ScreenProtectManager2.isScreenShareActive(this.$context)) {
                int length = ScreenProtectManager2.getDisplayManager(this.$context).getDisplays().length;
                CrashReporter.Companion companion = CrashReporter.INSTANCE;
                companion.log("Number of displays detected: " + length);
                CrashReporter.DefaultImpls.reportNonFatal$default(companion, new Exception("Screen sharing detected in " + this.$flow.name()), false, null, 4, null);
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(ScreenProtectManager.this.navigator, this.$context, ScreenProtectFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void blockScreenSharing(Context context, ScreenProtectFlow flow) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flow, "flow");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C372931(context, flow, null), 3, null);
    }

    public final void setFlagSecure(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (getEnabled()) {
            activity.getWindow().setFlags(8192, 8192);
        }
    }

    public final void clearFlagSecure(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().clearFlags(8192);
    }
}
