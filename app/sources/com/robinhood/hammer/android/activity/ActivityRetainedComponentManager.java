package com.robinhood.hammer.android.activity;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.view.ComponentActivity;
import com.robinhood.hammer.android.activity.ActivityRetainedComponent;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityRetainedComponentManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityRetainedComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;", "activity", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "createComponent", "getViewModelProvider", "Landroid/app/Activity;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "ActivityRetainedComponentViewModel", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ActivityRetainedComponentManager extends AbstractComponentManager<ActivityRetainedComponent> {
    private final ViewModelProvider viewModelProvider;

    public ActivityRetainedComponentManager(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.viewModelProvider = getViewModelProvider(activity, activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public ActivityRetainedComponent createComponent() {
        return ((ActivityRetainedComponentViewModel) this.viewModelProvider.get(ActivityRetainedComponentViewModel.class)).getComponent();
    }

    /* compiled from: ActivityRetainedComponentManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/activity/ActivityRetainedComponentManager$ActivityRetainedComponentViewModel;", "Landroidx/lifecycle/ViewModel;", "component", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;", "<init>", "(Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;)V", "getComponent", "()Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActivityRetainedComponentViewModel extends ViewModel {
        private final ActivityRetainedComponent component;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.component = component;
        }

        public final ActivityRetainedComponent getComponent() {
            return this.component;
        }
    }

    private final ViewModelProvider getViewModelProvider(final Activity activity, ViewModelStoreOwner owner) {
        return new ViewModelProvider(owner, new ViewModelProvider.Factory() { // from class: com.robinhood.hammer.android.activity.ActivityRetainedComponentManager.getViewModelProvider.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ComponentCallbacks2 application = activity.getApplication();
                if (!(application instanceof ApplicationComponentManagerHolder)) {
                    throw new IllegalStateException("Application class must implement ApplicationComponentManagerHolder");
                }
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponent.ParentComponent) ((ApplicationComponentManagerHolder) application).getComponentManager().get()).createActivityRetainedSubcomponentFactory().build());
            }
        });
    }
}
