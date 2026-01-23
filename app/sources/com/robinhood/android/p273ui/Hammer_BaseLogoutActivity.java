package com.robinhood.android.p273ui;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import com.robinhood.hammer.android.activity.ActivityComponentManager;
import com.robinhood.hammer.android.activity.ActivityComponentManagerHolder;
import com.robinhood.hammer.android.activity.ActivityRetainedComponentManager;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator2;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_BaseLogoutActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/ui/Hammer_BaseLogoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/robinhood/hammer/android/activity/ActivityComponentManagerHolder;", "<init>", "()V", "p0", "", "(I)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/activity/ActivityComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/activity/ActivityComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "inject", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes9.dex */
public abstract class Hammer_BaseLogoutActivity extends AppCompatActivity implements ActivityComponentManagerHolder {
    public static final int $stable = 8;

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_BaseLogoutActivity(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public /* synthetic */ Hammer_BaseLogoutActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ActivityComponentManager getComponentManager() {
        return (ActivityComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityComponentManager componentManager_delegate$lambda$0(Hammer_BaseLogoutActivity hammer_BaseLogoutActivity) {
        return new ActivityComponentManager(hammer_BaseLogoutActivity, new ActivityRetainedComponentManager(hammer_BaseLogoutActivity));
    }

    @Override // androidx.view.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return HammerViewModelFactoryCreator2.createHammerViewModelFactory(this, super.getDefaultViewModelProviderFactory());
    }

    private Hammer_BaseLogoutActivity() {
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.ui.Hammer_BaseLogoutActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_BaseLogoutActivity.componentManager_delegate$lambda$0(this.f$0);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.robinhood.android.ui.Hammer_BaseLogoutActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Hammer_BaseLogoutActivity.this.inject();
            }
        });
    }

    private Hammer_BaseLogoutActivity(int i) {
        super(i);
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.ui.Hammer_BaseLogoutActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_BaseLogoutActivity.componentManager_delegate$lambda$0(this.f$0);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.robinhood.android.ui.Hammer_BaseLogoutActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Hammer_BaseLogoutActivity.this.inject();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_BaseLogoutActivity2 hammer_BaseLogoutActivity2 = (Hammer_BaseLogoutActivity2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.ui.BaseLogoutActivity");
        hammer_BaseLogoutActivity2.inject((BaseLogoutActivity) this);
        this.injected = true;
    }
}
