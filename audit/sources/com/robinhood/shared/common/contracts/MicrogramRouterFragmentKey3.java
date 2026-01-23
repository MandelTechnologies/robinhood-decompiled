package com.robinhood.shared.common.contracts;

import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrogramRouterFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.contracts.LoadingNavButtonType, reason: use source file name */
/* loaded from: classes26.dex */
public final class MicrogramRouterFragmentKey3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrogramRouterFragmentKey3[] $VALUES;
    public static final MicrogramRouterFragmentKey3 BACK = new MicrogramRouterFragmentKey3("BACK", 0);
    public static final MicrogramRouterFragmentKey3 CLOSE = new MicrogramRouterFragmentKey3("CLOSE", 1);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ MicrogramRouterFragmentKey3[] $values() {
        return new MicrogramRouterFragmentKey3[]{BACK, CLOSE};
    }

    public static EnumEntries<MicrogramRouterFragmentKey3> getEntries() {
        return $ENTRIES;
    }

    private MicrogramRouterFragmentKey3(String str, int i) {
    }

    static {
        MicrogramRouterFragmentKey3[] microgramRouterFragmentKey3Arr$values = $values();
        $VALUES = microgramRouterFragmentKey3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(microgramRouterFragmentKey3Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MicrogramRouterFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/LoadingNavButtonType$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "value", "", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.contracts.LoadingNavButtonType$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MicrogramRouterFragmentKey3 from(String value) {
            return Intrinsics.areEqual(value, TestTags.BACK) ? MicrogramRouterFragmentKey3.BACK : Intrinsics.areEqual(value, "close") ? MicrogramRouterFragmentKey3.CLOSE : MicrogramRouterFragmentKey3.BACK;
        }
    }

    public static MicrogramRouterFragmentKey3 valueOf(String str) {
        return (MicrogramRouterFragmentKey3) Enum.valueOf(MicrogramRouterFragmentKey3.class, str);
    }

    public static MicrogramRouterFragmentKey3[] values() {
        return (MicrogramRouterFragmentKey3[]) $VALUES.clone();
    }
}
