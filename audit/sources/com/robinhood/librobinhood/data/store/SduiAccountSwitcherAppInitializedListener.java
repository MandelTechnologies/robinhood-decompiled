package com.robinhood.librobinhood.data.store;

import android.app.Application;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dagger.Lazy;
import dispatch.core.Launch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiAccountSwitcherAppInitializedListener.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherAppInitializedListener;", "Lcom/robinhood/utils/AppInitializedListener;", "sduiAccountSwitcherStore", "Ldagger/Lazy;", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineScope;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SduiAccountSwitcherAppInitializedListener implements AppInitializedListener {
    private final CoroutineScope rootCoroutineScope;
    private final Lazy<SduiAccountSwitcherStore> sduiAccountSwitcherStore;

    public SduiAccountSwitcherAppInitializedListener(Lazy<SduiAccountSwitcherStore> sduiAccountSwitcherStore, @RootCoroutineScope CoroutineScope rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(sduiAccountSwitcherStore, "sduiAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.sduiAccountSwitcherStore = sduiAccountSwitcherStore;
        this.rootCoroutineScope = rootCoroutineScope;
    }

    /* compiled from: SduiAccountSwitcherAppInitializedListener.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SduiAccountSwitcherAppInitializedListener$onAppInitialized$1", m3645f = "SduiAccountSwitcherAppInitializedListener.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SduiAccountSwitcherAppInitializedListener$onAppInitialized$1 */
    static final class C343151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C343151(Continuation<? super C343151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SduiAccountSwitcherAppInitializedListener.this.new C343151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C343151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SduiAccountSwitcherAppInitializedListener.this.sduiAccountSwitcherStore.get();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Launch.launchDefault$default(this.rootCoroutineScope, null, null, new C343151(null), 3, null);
    }
}
