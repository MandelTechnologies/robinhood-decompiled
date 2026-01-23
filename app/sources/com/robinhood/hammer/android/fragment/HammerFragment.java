package com.robinhood.hammer.android.fragment;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator2;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerBaseClass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HammerFragment.kt */
@HammerBaseClass
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0019\u001a\u00020\u0012H\u0002R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/hammer/android/fragment/HammerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManagerHolder;", "<init>", "()V", "contentLayoutId", "", "(I)V", "componentManager", "Lcom/robinhood/hammer/core/internal/ComponentManager;", "Lcom/robinhood/hammer/android/fragment/FragmentComponent;", "getComponentManager", "()Lcom/robinhood/hammer/core/internal/ComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "injected", "", "onAttach", "", "context", "Landroid/content/Context;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "inject", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public class HammerFragment extends Fragment implements FragmentComponentManagerHolder {

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public HammerFragment() {
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.hammer.android.fragment.HammerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HammerFragment.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    public HammerFragment(int i) {
        super(i);
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.hammer.android.fragment.HammerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HammerFragment.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public ComponentManager<FragmentComponent> getComponentManager() {
        return (ComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentComponentManager componentManager_delegate$lambda$0(HammerFragment hammerFragment) {
        return new FragmentComponentManager(hammerFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return HammerViewModelFactoryCreator2.createHammerViewModelFactory(this, defaultViewModelProviderFactory);
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        ((HammerFragment2) getComponentManager().get()).getFragmentInjector().inject(this);
        this.injected = true;
    }
}
