package com.robinhood.android.recommendations.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/recommendations/contracts/RecommendationsOrder;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "source", "", "recommendationId", "Ljava/util/UUID;", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getRecommendationId", "()Ljava/util/UUID;", "getAccountNumber", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.contracts.RecommendationsOrder, reason: use source file name */
/* loaded from: classes17.dex */
public final class RecommendationsIntentKeys2 implements IntentKey {
    private final String accountNumber;
    private final UUID recommendationId;
    private final String source;

    public RecommendationsIntentKeys2(String source, UUID recommendationId, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        this.source = source;
        this.recommendationId = recommendationId;
        this.accountNumber = str;
    }

    public /* synthetic */ RecommendationsIntentKeys2(String str, UUID uuid, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, (i & 4) != 0 ? null : str2);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final String getSource() {
        return this.source;
    }

    public final UUID getRecommendationId() {
        return this.recommendationId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
