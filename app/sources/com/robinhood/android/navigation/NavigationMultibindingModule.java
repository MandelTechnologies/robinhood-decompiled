package com.robinhood.android.navigation;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: NavigationMultibindingModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/NavigationMultibindingModule;", "", "navigationKeys", "", "", "getNavigationKeys", "()Ljava/util/Set;", "navigationResolverSuppliers", "", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "getNavigationResolverSuppliers", "()Ljava/util/Map;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface NavigationMultibindingModule {
    @Navigation
    Set<String> getNavigationKeys();

    @Navigation
    Map<String, Function0<NavigationResolver>> getNavigationResolverSuppliers();
}
