package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Z */
/* loaded from: classes24.dex */
public enum EnumC6898Z implements Internal.EnumLite {
    WEBVIEW_FALLBACK_BACKGROUND_DEFAULT(0),
    WEBVIEW_FALLBACK_BACKGROUND_LIGHT(1),
    WEBVIEW_FALLBACK_BACKGROUND_DARK(2),
    WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT(3),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_BACKGROUND_DARK_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_DEFAULT_VALUE = 0;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_LIGHT_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT_VALUE = 3;

    /* renamed from: b */
    public static final a f2529b = new a();

    /* renamed from: a */
    public final int f2531a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Z$a */
    public class a implements Internal.EnumLiteMap<EnumC6898Z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6898Z.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Z$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2532a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6898Z.forNumber(i) != null;
        }
    }

    EnumC6898Z(int i) {
        this.f2531a = i;
    }

    public static EnumC6898Z forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_BACKGROUND_DEFAULT;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_BACKGROUND_LIGHT;
        }
        if (i == 2) {
            return WEBVIEW_FALLBACK_BACKGROUND_DARK;
        }
        if (i != 3) {
            return null;
        }
        return WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT;
    }

    public static Internal.EnumLiteMap<EnumC6898Z> internalGetValueMap() {
        return f2529b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2532a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2531a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6898Z valueOf(int i) {
        return forNumber(i);
    }
}
