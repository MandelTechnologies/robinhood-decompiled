package com.robinhood.hammer.android.viewmodel;

import androidx.lifecycle.ViewModel;
import com.robinhood.hammer.android.internal.HammerViewModels;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: HammerViewModelFactory.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R%\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/ViewModelStubModule;", "", "hammerViewModelMap", "", "", "Landroidx/lifecycle/ViewModel;", "Lkotlin/jvm/JvmSuppressWildcards;", "getHammerViewModelMap", "()Ljava/util/Map;", "viewModelKeys", "", "getViewModelKeys", "()Ljava/util/Set;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.viewmodel.ViewModelStubModule, reason: use source file name */
/* loaded from: classes15.dex */
public interface HammerViewModelFactory6 {
    @HammerViewModels
    Map<String, ViewModel> getHammerViewModelMap();

    @HammerViewModels
    Set<String> getViewModelKeys();
}
