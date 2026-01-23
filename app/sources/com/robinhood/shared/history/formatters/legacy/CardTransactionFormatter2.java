package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.models.api.minerva.ApiCardTransactions;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;", "getLabelResId", "(Lcom/robinhood/models/db/mcduckling/CardTransaction$Status;)I", "Lcom/robinhood/models/api/minerva/ApiCardTransaction$Type;", "(Lcom/robinhood/models/api/minerva/ApiCardTransaction$Type;)I", "iconResId", "Lcom/robinhood/models/api/minerva/ApiCardTransaction$TokenType;", "getIconResId", "(Lcom/robinhood/models/api/minerva/ApiCardTransaction$TokenType;)Ljava/lang/Integer;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.CardTransactionFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CardTransactionFormatter2 {

    /* compiled from: CardTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.CardTransactionFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CardTransaction.Status.values().length];
            try {
                iArr[CardTransaction.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTransaction.Status.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTransaction.Status.DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCardTransactions.Type.values().length];
            try {
                iArr2[ApiCardTransactions.Type.ATM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiCardTransactions.Type.IN_PERSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiCardTransactions.Type.ONLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiCardTransactions.Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiCardTransactions.TokenType.values().length];
            try {
                iArr3[ApiCardTransactions.TokenType.APPLE_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiCardTransactions.TokenType.GOOGLE_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiCardTransactions.TokenType.SAMSUNG_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final int getLabelResId(CardTransaction.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            return C39006R.string.card_transaction_status_pending;
        }
        if (i == 2) {
            return C39006R.string.card_transaction_status_settled;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C39006R.string.card_transaction_status_declined;
    }

    public static final int getLabelResId(ApiCardTransactions.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            return C39006R.string.card_transaction_type_atm;
        }
        if (i == 2) {
            return C39006R.string.card_transaction_type_in_person;
        }
        if (i == 3) {
            return C39006R.string.card_transaction_type_online;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C39006R.string.card_transaction_type_unknown;
    }

    public static final Integer getIconResId(ApiCardTransactions.TokenType tokenType) {
        Intrinsics.checkNotNullParameter(tokenType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[tokenType.ordinal()];
        if (i == 1) {
            return Integer.valueOf(C39006R.drawable.ic_apple_pay_mark);
        }
        if (i != 2) {
            return null;
        }
        return Integer.valueOf(C39006R.drawable.ic_google_pay_mark);
    }
}
