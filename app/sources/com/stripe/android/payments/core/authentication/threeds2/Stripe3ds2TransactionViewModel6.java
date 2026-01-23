package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.instantapps.InstantApps;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.DaggerStripe3ds2TransactionViewModelFactoryComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "(Lkotlin/jvm/functions/Function0;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory, reason: use source file name */
/* loaded from: classes22.dex */
public final class Stripe3ds2TransactionViewModel6 implements ViewModelProvider.Factory {
    private final Function0<Stripe3ds2TransactionContract.Args> argsSupplier;

    public Stripe3ds2TransactionViewModel6(Function0<Stripe3ds2TransactionContract.Args> argsSupplier) {
        Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
        this.argsSupplier = argsSupplier;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        final Stripe3ds2TransactionContract.Args argsInvoke = this.argsSupplier.invoke();
        Application applicationRequireApplication = CreationExtrasKtx.requireApplication(extras);
        Stripe3ds2TransactionViewModel viewModel = DaggerStripe3ds2TransactionViewModelFactoryComponent.builder().context(applicationRequireApplication).enableLogging(argsInvoke.getEnableLogging()).publishableKeyProvider(new Function0<String>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory$create$subcomponentBuilder$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return argsInvoke.getPublishableKey();
            }
        }).productUsage(argsInvoke.getProductUsage()).isInstantApp(InstantApps.isInstantApp(applicationRequireApplication)).build().getSubcomponentBuilder().args(argsInvoke).savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).application(applicationRequireApplication).build().getViewModel();
        Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return viewModel;
    }
}
