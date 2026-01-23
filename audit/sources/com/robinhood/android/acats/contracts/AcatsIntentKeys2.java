package com.robinhood.android.acats.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsLanded;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "acatsTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAcatsTransferId", "()Ljava/util/UUID;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.contracts.AcatsLanded, reason: use source file name */
/* loaded from: classes17.dex */
public final class AcatsIntentKeys2 implements IntentKey {
    private final UUID acatsTransferId;

    public AcatsIntentKeys2(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        this.acatsTransferId = acatsTransferId;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final UUID getAcatsTransferId() {
        return this.acatsTransferId;
    }
}
