package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.W */
/* loaded from: classes24.dex */
public enum EnumC6895W implements Internal.EnumLite {
    URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION(0),
    URL_BEHAVIOR_PREFER_UNIVERSAL_LINK(1),
    UNRECOGNIZED(-1);

    public static final int URL_BEHAVIOR_PREFER_UNIVERSAL_LINK_VALUE = 1;
    public static final int URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION_VALUE = 0;

    /* renamed from: b */
    public static final a f2521b = new a();

    /* renamed from: a */
    public final int f2523a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.W$a */
    public class a implements Internal.EnumLiteMap<EnumC6895W> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6895W.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.W$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2524a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6895W.forNumber(i) != null;
        }
    }

    EnumC6895W(int i) {
        this.f2523a = i;
    }

    public static EnumC6895W forNumber(int i) {
        if (i == 0) {
            return URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION;
        }
        if (i != 1) {
            return null;
        }
        return URL_BEHAVIOR_PREFER_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<EnumC6895W> internalGetValueMap() {
        return f2521b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2524a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2523a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6895W valueOf(int i) {
        return forNumber(i);
    }
}
