package com.robinhood.shared.common.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrogramRouterFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/LoadingContent;", "", "<init>", "(Ljava/lang/String;I)V", "LIST", "GENERIC", "BOXES", "HERO", "EMPTY", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.contracts.LoadingContent, reason: use source file name */
/* loaded from: classes26.dex */
public final class MicrogramRouterFragmentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrogramRouterFragmentKey2[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MicrogramRouterFragmentKey2 LIST = new MicrogramRouterFragmentKey2("LIST", 0);
    public static final MicrogramRouterFragmentKey2 GENERIC = new MicrogramRouterFragmentKey2("GENERIC", 1);
    public static final MicrogramRouterFragmentKey2 BOXES = new MicrogramRouterFragmentKey2("BOXES", 2);
    public static final MicrogramRouterFragmentKey2 HERO = new MicrogramRouterFragmentKey2("HERO", 3);
    public static final MicrogramRouterFragmentKey2 EMPTY = new MicrogramRouterFragmentKey2("EMPTY", 4);

    private static final /* synthetic */ MicrogramRouterFragmentKey2[] $values() {
        return new MicrogramRouterFragmentKey2[]{LIST, GENERIC, BOXES, HERO, EMPTY};
    }

    public static EnumEntries<MicrogramRouterFragmentKey2> getEntries() {
        return $ENTRIES;
    }

    private MicrogramRouterFragmentKey2(String str, int i) {
    }

    static {
        MicrogramRouterFragmentKey2[] microgramRouterFragmentKey2Arr$values = $values();
        $VALUES = microgramRouterFragmentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(microgramRouterFragmentKey2Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MicrogramRouterFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/LoadingContent$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/shared/common/contracts/LoadingContent;", "value", "", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.contracts.LoadingContent$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final MicrogramRouterFragmentKey2 from(String value) {
            if (value != null) {
                switch (value.hashCode()) {
                    case -80148009:
                        if (value.equals("generic")) {
                            return MicrogramRouterFragmentKey2.GENERIC;
                        }
                        break;
                    case 3198970:
                        if (value.equals("hero")) {
                            return MicrogramRouterFragmentKey2.HERO;
                        }
                        break;
                    case 3322014:
                        if (value.equals("list")) {
                            return MicrogramRouterFragmentKey2.LIST;
                        }
                        break;
                    case 93930425:
                        if (value.equals("boxes")) {
                            return MicrogramRouterFragmentKey2.BOXES;
                        }
                        break;
                    case 96634189:
                        if (value.equals("empty")) {
                            return MicrogramRouterFragmentKey2.EMPTY;
                        }
                        break;
                }
            }
            return MicrogramRouterFragmentKey2.HERO;
        }
    }

    public static MicrogramRouterFragmentKey2 valueOf(String str) {
        return (MicrogramRouterFragmentKey2) Enum.valueOf(MicrogramRouterFragmentKey2.class, str);
    }

    public static MicrogramRouterFragmentKey2[] values() {
        return (MicrogramRouterFragmentKey2[]) $VALUES.clone();
    }
}
