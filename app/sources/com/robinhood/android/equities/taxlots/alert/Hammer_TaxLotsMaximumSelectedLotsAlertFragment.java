package com.robinhood.android.equities.taxlots.alert;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
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

/* compiled from: Hammer_TaxLotsMaximumSelectedLotsAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/Hammer_TaxLotsMaximumSelectedLotsAlertFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManagerHolder;", "<init>", "()V", "p0", "", "(I)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/fragment/FragmentComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "inject", "", "onAttach", "context", "Landroid/content/Context;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes3.dex */
public abstract class Hammer_TaxLotsMaximumSelectedLotsAlertFragment extends DialogFragment implements FragmentComponentManagerHolder {
    public static final int $stable = 8;

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_TaxLotsMaximumSelectedLotsAlertFragment(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public /* synthetic */ Hammer_TaxLotsMaximumSelectedLotsAlertFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final FragmentComponentManager getComponentManager() {
        return (FragmentComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentComponentManager componentManager_delegate$lambda$0(Hammer_TaxLotsMaximumSelectedLotsAlertFragment hammer_TaxLotsMaximumSelectedLotsAlertFragment) {
        return new FragmentComponentManager(hammer_TaxLotsMaximumSelectedLotsAlertFragment);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return HammerViewModelFactoryCreator2.createHammerViewModelFactory(this, defaultViewModelProviderFactory);
    }

    private Hammer_TaxLotsMaximumSelectedLotsAlertFragment() {
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.Hammer_TaxLotsMaximumSelectedLotsAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_TaxLotsMaximumSelectedLotsAlertFragment.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    private Hammer_TaxLotsMaximumSelectedLotsAlertFragment(int i) {
        super(i);
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equities.taxlots.alert.Hammer_TaxLotsMaximumSelectedLotsAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_TaxLotsMaximumSelectedLotsAlertFragment.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_TaxLotsMaximumSelectedLotsAlertFragment2 hammer_TaxLotsMaximumSelectedLotsAlertFragment2 = (Hammer_TaxLotsMaximumSelectedLotsAlertFragment2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment");
        hammer_TaxLotsMaximumSelectedLotsAlertFragment2.inject((TaxLotsMaximumSelectedLotsAlertFragment) this);
        this.injected = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        inject();
    }
}
