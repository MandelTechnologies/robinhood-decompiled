package com.robinhood.android.recommendations.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/contracts/RecsRetirement;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "source", "", "accountNumber", "recommendationId", "isReorder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "getRecommendationId", "()Z", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.contracts.RecsRetirement, reason: use source file name */
/* loaded from: classes17.dex */
public final class RecommendationsIntentKeys3 implements IntentKey {
    private final String accountNumber;
    private final boolean isReorder;
    private final String recommendationId;
    private final String source;

    public RecommendationsIntentKeys3(String str, String accountNumber, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.source = str;
        this.accountNumber = accountNumber;
        this.recommendationId = str2;
        this.isReorder = z;
    }

    public /* synthetic */ RecommendationsIntentKeys3(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* renamed from: isReorder, reason: from getter */
    public final boolean getIsReorder() {
        return this.isReorder;
    }
}
