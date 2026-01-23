package com.robinhood.android.search.contracts;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: Hammer_SearchFragmentKey_NavigationKeyModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/contracts/Hammer_SearchFragmentKey_NavigationKeyModule;", "", "<init>", "()V", "provide", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Hammer_SearchFragmentKey_NavigationKeyModule {
    public static final Hammer_SearchFragmentKey_NavigationKeyModule INSTANCE = new Hammer_SearchFragmentKey_NavigationKeyModule();

    private Hammer_SearchFragmentKey_NavigationKeyModule() {
    }

    @Navigation
    public final String provide() {
        return "com.robinhood.android.search.contracts.SearchFragmentKey";
    }
}
