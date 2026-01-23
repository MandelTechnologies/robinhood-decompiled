package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.n */
/* loaded from: classes24.dex */
public enum EnumC7034n implements Internal.EnumLite {
    IOS_SDK_POPUP_BEHAVIOR_UNKNOWN(0),
    IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);


    /* renamed from: IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2685x3c61c69f = 4;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;

    /* renamed from: IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2687x7dc1ef5f = 5;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_SDK_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2688b = new a();

    /* renamed from: a */
    public final int f2690a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.n$a */
    public class a implements Internal.EnumLiteMap<EnumC7034n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7034n.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.n$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2691a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7034n.forNumber(i) != null;
        }
    }

    EnumC7034n(int i) {
        this.f2690a = i;
    }

    public static EnumC7034n forNumber(int i) {
        if (i == 0) {
            return IOS_SDK_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<EnumC7034n> internalGetValueMap() {
        return f2688b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2691a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2690a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7034n valueOf(int i) {
        return forNumber(i);
    }
}
