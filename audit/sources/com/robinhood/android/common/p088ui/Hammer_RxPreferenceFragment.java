package com.robinhood.android.common.p088ui;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.PreferenceFragmentCompat;
import com.robinhood.hammer.android.fragment.FragmentComponentManager;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator2;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_RxPreferenceFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/Hammer_RxPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManagerHolder;", "<init>", "()V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/fragment/FragmentComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "inject", "", "onAttach", "context", "Landroid/content/Context;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes2.dex */
public abstract class Hammer_RxPreferenceFragment extends PreferenceFragmentCompat implements FragmentComponentManagerHolder {
    public static final int $stable = 8;

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_RxPreferenceFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final FragmentComponentManager getComponentManager() {
        return (FragmentComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentComponentManager componentManager_delegate$lambda$0(Hammer_RxPreferenceFragment hammer_RxPreferenceFragment) {
        return new FragmentComponentManager(hammer_RxPreferenceFragment);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return HammerViewModelFactoryCreator2.createHammerViewModelFactory(this, defaultViewModelProviderFactory);
    }

    private Hammer_RxPreferenceFragment() {
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.Hammer_RxPreferenceFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_RxPreferenceFragment.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_RxPreferenceFragment2 hammer_RxPreferenceFragment2 = (Hammer_RxPreferenceFragment2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.common.ui.RxPreferenceFragment");
        hammer_RxPreferenceFragment2.inject((RxPreferenceFragment) this);
        this.injected = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        inject();
    }
}
