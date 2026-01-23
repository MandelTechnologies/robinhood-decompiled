package com.robinhood.android.optionschain.chainsettings.education;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Hammer_OptionChainCustomizationEducationFragment_Companion_NavigationResolverModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/Hammer_OptionChainCustomizationEducationFragment_Companion_NavigationResolverModule;", "", "<init>", "()V", "getter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "provide_OptionChainCustomizationEducationLaunchMode_MainChain", "provide_OptionChainCustomizationEducationLaunchMode_StrategyBuilder", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.education.Hammer_OptionChainCustomizationEducationFragment_Companion_NavigationResolverModule */
/* loaded from: classes17.dex */
public final class C24296x28547e40 {
    public static final int $stable = 0;
    public static final C24296x28547e40 INSTANCE = new C24296x28547e40();
    private static final Function0<NavigationResolver> getter = NavigationResolver.INSTANCE.lazyGetter("com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationFragment", "Companion");

    private C24296x28547e40() {
    }

    @Navigation
    public final Function0<NavigationResolver> provide_OptionChainCustomizationEducationLaunchMode_MainChain() {
        return getter;
    }

    @Navigation
    /* renamed from: provide_OptionChainCustomizationEducationLaunchMode_StrategyBuilder */
    public final Function0<NavigationResolver> m2327x102f01e2() {
        return getter;
    }
}
