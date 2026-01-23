package com.plaid.internal;

import android.os.Bundle;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.plaid.internal.AbstractC6037a8;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.V7 */
/* loaded from: classes16.dex */
public abstract class AbstractC5991V7<VM extends AbstractC6037a8> extends Fragment {

    /* renamed from: d */
    public static final /* synthetic */ int f1781d = 0;

    /* renamed from: a */
    public final Class<VM> f1782a;

    /* renamed from: b */
    public VM f1783b;

    /* renamed from: c */
    public final Lazy f1784c;

    /* renamed from: com.plaid.internal.V7$a */
    public static final class a extends Lambda implements Function1<InterfaceC5815C4, AbstractC6037a8> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC5991V7<VM> f1785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC5991V7<VM> abstractC5991V7) {
            super(1);
            this.f1785a = abstractC5991V7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AbstractC6037a8 invoke(InterfaceC5815C4 interfaceC5815C4) {
            InterfaceC5815C4 component = interfaceC5815C4;
            Intrinsics.checkNotNullParameter(component, "component");
            AbstractC5991V7<VM> abstractC5991V7 = this.f1785a;
            C6009X7 c6009x7 = (C6009X7) abstractC5991V7.f1784c.getValue();
            Intrinsics.checkNotNullExpressionValue(c6009x7, "access$getModelId(...)");
            return abstractC5991V7.mo1335a(c6009x7, component);
        }
    }

    public AbstractC5991V7() {
        Intrinsics.checkNotNullParameter(C7122k1.class, "viewModelClass");
        this.f1782a = C7122k1.class;
        this.f1784c = LazyKt.lazy(new C5982U7(this));
    }

    /* renamed from: a */
    public abstract C7122k1 mo1335a(C6009X7 c6009x7, InterfaceC5815C4 interfaceC5815C4);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        VM vm = (VM) new ViewModelProvider(this, ((InterfaceC6057c8) activity).mo1381a(new a(this))).get(this.f1782a);
        Intrinsics.checkNotNullParameter(vm, "<set-?>");
        this.f1783b = vm;
    }
}
