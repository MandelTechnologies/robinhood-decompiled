package com.robinhood.hammer.android.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.internal.HammerViewModels;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseViewModelComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nR+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\b\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent;", "", "hammerViewModelMap", "", "", "Ljavax/inject/Provider;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/jvm/JvmSuppressWildcards;", "getHammerViewModelMap", "()Ljava/util/Map;", "Factory", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface BaseViewModelComponent {

    /* compiled from: BaseViewModelComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "lifecycleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        BaseViewModelComponent create(SavedStateHandle handle, CoroutineScope lifecycleCoroutineScope);
    }

    @HammerViewModels
    Map<String, Provider<ViewModel>> getHammerViewModelMap();
}
