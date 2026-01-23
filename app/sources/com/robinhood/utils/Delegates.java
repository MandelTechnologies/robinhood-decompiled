package com.robinhood.utils;

import com.robinhood.utils.AssignOnceProperty;
import kotlin.Metadata;
import kotlin.properties.Interfaces3;

/* compiled from: Delegates.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/Delegates;", "", "<init>", "()V", "assignOnce", "Lkotlin/properties/ReadWriteProperty;", "T", "synchronized", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Delegates {
    public static final Delegates INSTANCE = new Delegates();

    private Delegates() {
    }

    public static /* synthetic */ Interfaces3 assignOnce$default(Delegates delegates, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return delegates.assignOnce(z);
    }

    public final <T> Interfaces3<Object, T> assignOnce(boolean z) {
        if (z) {
            return new AssignOnceProperty.Impl();
        }
        return new AssignOnceProperty.SynchronizedImpl();
    }
}
