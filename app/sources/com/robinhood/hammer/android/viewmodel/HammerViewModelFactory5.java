package com.robinhood.hammer.android.viewmodel;

import androidx.lifecycle.ViewModel;
import com.robinhood.hammer.android.internal.HammerViewModels;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: HammerViewModelFactory.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R%\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u001f\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/ViewModelActivityCreatorStubModule;", "", "viewModelSubcomponentFactoryMap", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "getViewModelSubcomponentFactoryMap", "()Ljava/util/Map;", "hammerViewModelMap", "Landroidx/lifecycle/ViewModel;", "getHammerViewModelMap", "viewModelKeys", "", "getViewModelKeys", "()Ljava/util/Set;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.viewmodel.ViewModelActivityCreatorStubModule, reason: use source file name */
/* loaded from: classes15.dex */
public interface HammerViewModelFactory5 {
    @HammerViewModels
    Map<String, ViewModel> getHammerViewModelMap();

    @HammerViewModels
    Set<String> getViewModelKeys();

    @HammerViewModels
    Map<String, BaseViewModelComponent.Factory> getViewModelSubcomponentFactoryMap();
}
