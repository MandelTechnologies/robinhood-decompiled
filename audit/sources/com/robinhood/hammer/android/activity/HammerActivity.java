package com.robinhood.hammer.android.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator2;
import com.robinhood.hammer.core.internal.HammerBaseClass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HammerActivity.kt */
@HammerBaseClass
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/HammerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/robinhood/hammer/android/activity/ActivityComponentManagerHolder;", "<init>", "()V", "contentLayoutId", "", "(I)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/activity/ActivityComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/activity/ActivityComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "inject", "", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public class HammerActivity extends AppCompatActivity implements ActivityComponentManagerHolder {

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public HammerActivity() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.robinhood.hammer.android.activity.HammerActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HammerActivity.this.inject();
            }
        });
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.hammer.android.activity.HammerActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HammerActivity.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    public HammerActivity(int i) {
        super(i);
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.robinhood.hammer.android.activity.HammerActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HammerActivity.this.inject();
            }
        });
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.hammer.android.activity.HammerActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HammerActivity.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public ActivityComponentManager getComponentManager() {
        return (ActivityComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityComponentManager componentManager_delegate$lambda$0(HammerActivity hammerActivity) {
        return new ActivityComponentManager(hammerActivity, new ActivityRetainedComponentManager(hammerActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inject() {
        if (this.injected) {
            return;
        }
        ((HammerActivity2) getComponentManager().get()).getActivityInjector().inject(this);
        this.injected = true;
    }

    @Override // androidx.view.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return HammerViewModelFactoryCreator2.createHammerViewModelFactory(this, defaultViewModelProviderFactory);
    }
}
