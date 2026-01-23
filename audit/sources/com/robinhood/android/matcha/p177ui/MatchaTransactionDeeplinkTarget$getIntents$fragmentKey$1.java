package com.robinhood.android.matcha.p177ui;

import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTargets.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$1 extends FunctionReferenceImpl implements Function1<UUID, LegacyFragmentKey.MatchaRequestDetail> {
    public static final MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$1 INSTANCE = new MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$1();

    MatchaTransactionDeeplinkTarget$getIntents$fragmentKey$1() {
        super(1, LegacyFragmentKey.MatchaRequestDetail.class, "<init>", "<init>(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LegacyFragmentKey.MatchaRequestDetail invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new LegacyFragmentKey.MatchaRequestDetail(p0);
    }
}
