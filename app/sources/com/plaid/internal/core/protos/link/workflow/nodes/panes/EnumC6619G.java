package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.G */
/* loaded from: classes24.dex */
public enum EnumC6619G implements Internal.EnumLite {
    UI_EXPERIENCE_DEFAULT(0),
    UI_EXPERIENCE_SPINNER_ONLY(1),
    UNRECOGNIZED(-1);

    public static final int UI_EXPERIENCE_DEFAULT_VALUE = 0;
    public static final int UI_EXPERIENCE_SPINNER_ONLY_VALUE = 1;

    /* renamed from: b */
    public static final a f2374b = new a();

    /* renamed from: a */
    public final int f2376a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.G$a */
    public class a implements Internal.EnumLiteMap<EnumC6619G> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6619G.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.G$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2377a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6619G.forNumber(i) != null;
        }
    }

    EnumC6619G(int i) {
        this.f2376a = i;
    }

    public static EnumC6619G forNumber(int i) {
        if (i == 0) {
            return UI_EXPERIENCE_DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return UI_EXPERIENCE_SPINNER_ONLY;
    }

    public static Internal.EnumLiteMap<EnumC6619G> internalGetValueMap() {
        return f2374b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2377a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2376a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6619G valueOf(int i) {
        return forNumber(i);
    }
}
