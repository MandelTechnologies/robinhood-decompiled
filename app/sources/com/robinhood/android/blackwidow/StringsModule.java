package com.robinhood.android.blackwidow;

import com.robinhood.android.blackwidow.LocalityStringResources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/StringsModule;", "", "<init>", "()V", "providesLocalityStringResources", "Lcom/robinhood/android/blackwidow/LocalityStringResources;", "impl", "Lcom/robinhood/android/blackwidow/LocalityStringResources$Impl;", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class StringsModule {
    public static final int $stable = 0;
    public static final StringsModule INSTANCE = new StringsModule();

    public final LocalityStringResources providesLocalityStringResources(LocalityStringResources.Impl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    private StringsModule() {
    }
}
