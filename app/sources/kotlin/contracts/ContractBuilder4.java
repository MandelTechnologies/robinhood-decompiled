package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContractBuilder.kt */
@SinceKotlin
@ContractsDsl
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ContractBuilder3
/* renamed from: kotlin.contracts.InvocationKind, reason: use source file name */
/* loaded from: classes14.dex */
public final class ContractBuilder4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContractBuilder4[] $VALUES;

    @ContractsDsl
    public static final ContractBuilder4 AT_MOST_ONCE = new ContractBuilder4("AT_MOST_ONCE", 0);

    @ContractsDsl
    public static final ContractBuilder4 AT_LEAST_ONCE = new ContractBuilder4("AT_LEAST_ONCE", 1);

    @ContractsDsl
    public static final ContractBuilder4 EXACTLY_ONCE = new ContractBuilder4("EXACTLY_ONCE", 2);

    @ContractsDsl
    public static final ContractBuilder4 UNKNOWN = new ContractBuilder4("UNKNOWN", 3);

    private static final /* synthetic */ ContractBuilder4[] $values() {
        return new ContractBuilder4[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    public static EnumEntries<ContractBuilder4> getEntries() {
        return $ENTRIES;
    }

    private ContractBuilder4(String str, int i) {
    }

    static {
        ContractBuilder4[] contractBuilder4Arr$values = $values();
        $VALUES = contractBuilder4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(contractBuilder4Arr$values);
    }

    public static ContractBuilder4 valueOf(String str) {
        return (ContractBuilder4) Enum.valueOf(ContractBuilder4.class, str);
    }

    public static ContractBuilder4[] values() {
        return (ContractBuilder4[]) $VALUES.clone();
    }
}
