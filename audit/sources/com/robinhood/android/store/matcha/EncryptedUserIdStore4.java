package com.robinhood.android.store.matcha;

import com.robinhood.android.moria.network.Endpoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: EncryptedUserIdStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.store.matcha.EncryptedUserIdStore$query$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class EncryptedUserIdStore4 extends AdaptedFunctionReference implements Function1<Unit, Job> {
    EncryptedUserIdStore4(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(Unit p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
