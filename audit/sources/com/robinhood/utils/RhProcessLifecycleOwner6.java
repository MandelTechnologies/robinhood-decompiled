package com.robinhood.utils;

import kotlin.Metadata;

/* compiled from: RhProcessLifecycleOwner.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/RhProcessLifecycleOwnerModule;", "", "<init>", "()V", "provideRhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.RhProcessLifecycleOwnerModule, reason: use source file name */
/* loaded from: classes21.dex */
public final class RhProcessLifecycleOwner6 {
    public static final RhProcessLifecycleOwner6 INSTANCE = new RhProcessLifecycleOwner6();

    private RhProcessLifecycleOwner6() {
    }

    public final RhProcessLifecycleOwner provideRhProcessLifecycleOwner() {
        return new RhProcessLifecycleOwner3();
    }
}
