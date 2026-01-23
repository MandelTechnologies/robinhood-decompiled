package com.robinhood.android.common.margin.p083ui.eligibility;

import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarginEligibilityCheck.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityCheck;", "", "<init>", "(Ljava/lang/String;I)V", "IDENTITY", "REVIEW_PROFILE", "BALANCE", "TRADES", "KNOWLEDGE_EXPERIENCE", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MarginEligibilityCheck {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarginEligibilityCheck[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarginEligibilityCheck IDENTITY = new MarginEligibilityCheck("IDENTITY", 0);
    public static final MarginEligibilityCheck REVIEW_PROFILE = new MarginEligibilityCheck("REVIEW_PROFILE", 1);
    public static final MarginEligibilityCheck BALANCE = new MarginEligibilityCheck("BALANCE", 2);
    public static final MarginEligibilityCheck TRADES = new MarginEligibilityCheck("TRADES", 3);
    public static final MarginEligibilityCheck KNOWLEDGE_EXPERIENCE = new MarginEligibilityCheck("KNOWLEDGE_EXPERIENCE", 4);

    private static final /* synthetic */ MarginEligibilityCheck[] $values() {
        return new MarginEligibilityCheck[]{IDENTITY, REVIEW_PROFILE, BALANCE, TRADES, KNOWLEDGE_EXPERIENCE};
    }

    public static EnumEntries<MarginEligibilityCheck> getEntries() {
        return $ENTRIES;
    }

    private MarginEligibilityCheck(String str, int i) {
    }

    static {
        MarginEligibilityCheck[] marginEligibilityCheckArr$values = $values();
        $VALUES = marginEligibilityCheckArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marginEligibilityCheckArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MarginEligibilityCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityCheck$Companion;", "", "<init>", "()V", "toMarginEligibilityCheck", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityCheck;", "apiMarginEligibilityCheck", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginEligibilityCheck toMarginEligibilityCheck(ApiMarginEligibility2 apiMarginEligibilityCheck) {
            Intrinsics.checkNotNullParameter(apiMarginEligibilityCheck, "apiMarginEligibilityCheck");
            if (apiMarginEligibilityCheck instanceof ApiMarginEligibility2.Identity) {
                return MarginEligibilityCheck.IDENTITY;
            }
            if (apiMarginEligibilityCheck instanceof ApiMarginEligibility2.Suitability) {
                return MarginEligibilityCheck.REVIEW_PROFILE;
            }
            if (apiMarginEligibilityCheck instanceof ApiMarginEligibility2.AccountBalance) {
                return MarginEligibilityCheck.BALANCE;
            }
            if (apiMarginEligibilityCheck instanceof ApiMarginEligibility2.TradeHistory) {
                return MarginEligibilityCheck.TRADES;
            }
            if (apiMarginEligibilityCheck instanceof ApiMarginEligibility2.KnowledgeExperienceGb) {
                return MarginEligibilityCheck.KNOWLEDGE_EXPERIENCE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static MarginEligibilityCheck valueOf(String str) {
        return (MarginEligibilityCheck) Enum.valueOf(MarginEligibilityCheck.class, str);
    }

    public static MarginEligibilityCheck[] values() {
        return (MarginEligibilityCheck[]) $VALUES.clone();
    }
}
