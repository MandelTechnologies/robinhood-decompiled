package com.robinhood.android.recurring.contracts;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ForceIntro.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/ForceIntro;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "TRUE", "FALSE", "SKIP_INTRO", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ForceIntro implements RhEnum<ForceIntro> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ForceIntro[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final ForceIntro TRUE = new ForceIntro("TRUE", 0, "true");
    public static final ForceIntro FALSE = new ForceIntro("FALSE", 1, "false");
    public static final ForceIntro SKIP_INTRO = new ForceIntro("SKIP_INTRO", 2, "skip_intro");

    private static final /* synthetic */ ForceIntro[] $values() {
        return new ForceIntro[]{TRUE, FALSE, SKIP_INTRO};
    }

    public static EnumEntries<ForceIntro> getEntries() {
        return $ENTRIES;
    }

    private ForceIntro(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ForceIntro[] forceIntroArr$values = $values();
        $VALUES = forceIntroArr$values;
        $ENTRIES = EnumEntries2.enumEntries(forceIntroArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ForceIntro.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/ForceIntro$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Required;", "Lcom/robinhood/android/recurring/contracts/ForceIntro;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Required<ForceIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ForceIntro.values());
        }
    }

    public static ForceIntro valueOf(String str) {
        return (ForceIntro) Enum.valueOf(ForceIntro.class, str);
    }

    public static ForceIntro[] values() {
        return (ForceIntro[]) $VALUES.clone();
    }
}
