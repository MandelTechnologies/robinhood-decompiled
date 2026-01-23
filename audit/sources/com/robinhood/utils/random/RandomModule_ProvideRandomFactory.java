package com.robinhood.utils.random;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* compiled from: RandomModule_ProvideRandomFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/random/RandomModule_ProvideRandomFactory;", "Ldagger/internal/Factory;", "Lkotlin/random/Random;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideRandom", "lib-utils-random"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RandomModule_ProvideRandomFactory implements Factory<Random> {
    public static final RandomModule_ProvideRandomFactory INSTANCE = new RandomModule_ProvideRandomFactory();

    private RandomModule_ProvideRandomFactory() {
    }

    @Override // javax.inject.Provider
    public Random get() {
        return provideRandom();
    }

    @JvmStatic
    public static final RandomModule_ProvideRandomFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Random provideRandom() {
        Object objCheckNotNull = Preconditions.checkNotNull(RandomModule.INSTANCE.provideRandom(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Random) objCheckNotNull;
    }
}
