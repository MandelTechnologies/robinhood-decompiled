package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 */
/* loaded from: classes24.dex */
public enum EnumC6902b0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2544b = new a();

    /* renamed from: a */
    public final int f2546a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.b0$a */
    public class a implements Internal.EnumLiteMap<EnumC6902b0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6902b0.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.b0$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2547a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6902b0.forNumber(i) != null;
        }
    }

    EnumC6902b0(int i) {
        this.f2546a = i;
    }

    public static EnumC6902b0 forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_MODE_UNKNOWN;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        if (i != 2) {
            return null;
        }
        return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
    }

    public static Internal.EnumLiteMap<EnumC6902b0> internalGetValueMap() {
        return f2544b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2547a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2546a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6902b0 valueOf(int i) {
        return forNumber(i);
    }
}
