package com.robinhood.android.microgramsdui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramLaunchId;

/* compiled from: MicrogramManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager$referenceManager$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MicrogramManager8 extends FunctionReferenceImpl implements Function1<MicrogramLaunchId, MicrogramManager2> {
    MicrogramManager8(Object obj) {
        super(1, obj, MicrogramManager4.class, "createInstance", "createInstance(Lmicrogram/android/MicrogramLaunchId;)Lcom/robinhood/android/microgramsdui/MicrogramInstance;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MicrogramManager2 invoke(MicrogramLaunchId p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((MicrogramManager4) this.receiver).createInstance(p0);
    }
}
