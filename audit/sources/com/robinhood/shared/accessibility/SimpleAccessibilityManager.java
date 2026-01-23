package com.robinhood.shared.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.shared.accessibility.SimpleAccessibilityManager;
import dagger.Lazy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SimpleAccessibilityManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "context", "Ldagger/Lazy;", "Landroid/content/Context;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;)V", "streamKeyInputAccessibilityEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "checkKeyInputs", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "lib-a11y_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class SimpleAccessibilityManager implements RhAccessibilityManager {
    private final Lazy<Context> context;
    private final Lazy<ExperimentsProvider> experimentsProvider;

    public SimpleAccessibilityManager(Lazy<Context> context, Lazy<ExperimentsProvider> experimentsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.context = context;
        this.experimentsProvider = experimentsProvider;
    }

    /* compiled from: SimpleAccessibilityManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.accessibility.SimpleAccessibilityManager$streamKeyInputAccessibilityEnabled$1", m3645f = "SimpleAccessibilityManager.kt", m3646l = {36, 41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.accessibility.SimpleAccessibilityManager$streamKeyInputAccessibilityEnabled$1 */
    static final class C372961 extends ContinuationImpl7 implements Function2<Produce4<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccessibilityManager $accessibilityManager;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C372961(AccessibilityManager accessibilityManager, Continuation<? super C372961> continuation) {
            super(2, continuation);
            this.$accessibilityManager = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C372961 c372961 = SimpleAccessibilityManager.this.new C372961(this.$accessibilityManager, continuation);
            c372961.L$0 = obj;
            return c372961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Boolean> produce4, Continuation<? super Unit> continuation) {
            return ((C372961) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
        
            if (kotlinx.coroutines.channels.Produce.awaitClose(r3, r4, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce42 = (Produce4) this.L$0;
                final SimpleAccessibilityManager simpleAccessibilityManager = SimpleAccessibilityManager.this;
                final AccessibilityManager accessibilityManager = this.$accessibilityManager;
                accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.robinhood.shared.accessibility.SimpleAccessibilityManager$streamKeyInputAccessibilityEnabled$1$listener$1
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        produce42.mo8337trySendJP2dKIU(Boolean.valueOf(simpleAccessibilityManager.checkKeyInputs(accessibilityManager)));
                    }
                };
                Boolean boolBoxBoolean = boxing.boxBoolean(SimpleAccessibilityManager.this.checkKeyInputs(this.$accessibilityManager));
                this.L$0 = produce42;
                this.L$1 = accessibilityStateChangeListener;
                this.label = 1;
                if (produce42.send(boolBoxBoolean, this) != coroutine_suspended) {
                    produce4 = produce42;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            accessibilityStateChangeListener = (AccessibilityManager.AccessibilityStateChangeListener) this.L$1;
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            final AccessibilityManager accessibilityManager2 = this.$accessibilityManager;
            Function0 function0 = new Function0() { // from class: com.robinhood.shared.accessibility.SimpleAccessibilityManager$streamKeyInputAccessibilityEnabled$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SimpleAccessibilityManager.C372961.invokeSuspend$lambda$0(accessibilityManager2, accessibilityStateChangeListener);
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.accessibility.RhAccessibilityManager
    public Flow<Boolean> streamKeyInputAccessibilityEnabled() {
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        return accessibilityManager == null ? FlowKt.flowOf(Boolean.FALSE) : FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new C372961(accessibilityManager, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkKeyInputs(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        Intrinsics.checkNotNullExpressionValue(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
        Iterator<T> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            String id = ((AccessibilityServiceInfo) it.next()).getId();
            Intrinsics.checkNotNull(id);
            if (StringsKt.contains$default((CharSequence) id, (CharSequence) "switchaccess", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) id, (CharSequence) "talkback", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) id, (CharSequence) "keyboard", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
