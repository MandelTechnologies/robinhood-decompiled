package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 */
/* loaded from: classes24.dex */
public enum EnumC6900a0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);


    /* renamed from: WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2535x9bdf90d = 4;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;

    /* renamed from: WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE */
    public static final int f2537x64db3e4d = 5;

    /* renamed from: WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE */
    public static final int f2538x6329a240 = 3;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2539b = new a();

    /* renamed from: a */
    public final int f2541a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.a0$a */
    public class a implements Internal.EnumLiteMap<EnumC6900a0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6900a0.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.a0$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2542a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6900a0.forNumber(i) != null;
        }
    }

    EnumC6900a0(int i) {
        this.f2541a = i;
    }

    public static EnumC6900a0 forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<EnumC6900a0> internalGetValueMap() {
        return f2539b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2542a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2541a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6900a0 valueOf(int i) {
        return forNumber(i);
    }
}
