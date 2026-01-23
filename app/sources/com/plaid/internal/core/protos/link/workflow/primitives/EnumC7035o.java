package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.o */
/* loaded from: classes24.dex */
public enum EnumC7035o implements Internal.EnumLite {
    IOS_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);


    /* renamed from: IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2692xdcebba96 = 4;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;

    /* renamed from: IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2693x239ec196 = 5;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2694b = new a();

    /* renamed from: a */
    public final int f2696a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.o$a */
    public class a implements Internal.EnumLiteMap<EnumC7035o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7035o.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.o$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2697a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7035o.forNumber(i) != null;
        }
    }

    EnumC7035o(int i) {
        this.f2696a = i;
    }

    public static EnumC7035o forNumber(int i) {
        if (i == 0) {
            return IOS_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<EnumC7035o> internalGetValueMap() {
        return f2694b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2697a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2696a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7035o valueOf(int i) {
        return forNumber(i);
    }
}
