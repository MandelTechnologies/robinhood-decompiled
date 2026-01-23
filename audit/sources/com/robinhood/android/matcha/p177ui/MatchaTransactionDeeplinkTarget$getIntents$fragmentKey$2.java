package com.robinhood.android.matcha.p177ui;

import com.robinhood.android.history.contracts.MatchaTransferDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTargets.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$2 extends FunctionReferenceImpl implements Function1<UUID, MatchaTransferDetailFragmentKey> {
    public static final MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$2 INSTANCE = new MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$2();

    MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$2() {
        super(1, MatchaTransferDetailFragmentKey.class, "<init>", "<init>(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MatchaTransferDetailFragmentKey invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new MatchaTransferDetailFragmentKey(p0);
    }
}
