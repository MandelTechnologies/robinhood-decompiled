package androidx.compose.p011ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FocusTransactions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "(Ljava/lang/String;I)V", "None", "Cancelled", "Redirected", "RedirectCancelled", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.focus.CustomDestinationResult, reason: use source file name */
/* loaded from: classes.dex */
public final class FocusTransactions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FocusTransactions[] $VALUES;
    public static final FocusTransactions None = new FocusTransactions("None", 0);
    public static final FocusTransactions Cancelled = new FocusTransactions("Cancelled", 1);
    public static final FocusTransactions Redirected = new FocusTransactions("Redirected", 2);
    public static final FocusTransactions RedirectCancelled = new FocusTransactions("RedirectCancelled", 3);

    private static final /* synthetic */ FocusTransactions[] $values() {
        return new FocusTransactions[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    public static EnumEntries<FocusTransactions> getEntries() {
        return $ENTRIES;
    }

    public static FocusTransactions valueOf(String str) {
        return (FocusTransactions) Enum.valueOf(FocusTransactions.class, str);
    }

    public static FocusTransactions[] values() {
        return (FocusTransactions[]) $VALUES.clone();
    }

    private FocusTransactions(String str, int i) {
    }

    static {
        FocusTransactions[] focusTransactionsArr$values = $values();
        $VALUES = focusTransactionsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(focusTransactionsArr$values);
    }
}
