package com.robinhood.hammer.android.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.internal.LifecycleCoroutineScope;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultViewModelComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent;", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent;", "Factory", "ParentComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface DefaultViewModelComponent extends BaseViewModelComponent {

    /* compiled from: DefaultViewModelComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "lifecycleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory extends BaseViewModelComponent.Factory {
        @Override // com.robinhood.hammer.android.viewmodel.BaseViewModelComponent.Factory
        DefaultViewModelComponent create(SavedStateHandle handle, @LifecycleCoroutineScope CoroutineScope lifecycleCoroutineScope);
    }

    /* compiled from: DefaultViewModelComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$ParentComponent;", "", "createViewModelSubcomponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ParentComponent {
        Factory createViewModelSubcomponentFactory();
    }
}
