package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.F */
/* loaded from: classes24.dex */
public enum EnumC6598F implements Internal.EnumLite {
    OAUTH_SUBMISSION_METHOD_UNKNOWN(0),
    OAUTH_SUBMISSION_METHOD_POLLING(1),
    OAUTH_SUBMISSION_METHOD_REDIRECT(2),
    UNRECOGNIZED(-1);

    public static final int OAUTH_SUBMISSION_METHOD_POLLING_VALUE = 1;
    public static final int OAUTH_SUBMISSION_METHOD_REDIRECT_VALUE = 2;
    public static final int OAUTH_SUBMISSION_METHOD_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2355b = new a();

    /* renamed from: a */
    public final int f2357a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.F$a */
    public class a implements Internal.EnumLiteMap<EnumC6598F> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6598F.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.F$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2358a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6598F.forNumber(i) != null;
        }
    }

    EnumC6598F(int i) {
        this.f2357a = i;
    }

    public static EnumC6598F forNumber(int i) {
        if (i == 0) {
            return OAUTH_SUBMISSION_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return OAUTH_SUBMISSION_METHOD_POLLING;
        }
        if (i != 2) {
            return null;
        }
        return OAUTH_SUBMISSION_METHOD_REDIRECT;
    }

    public static Internal.EnumLiteMap<EnumC6598F> internalGetValueMap() {
        return f2355b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2358a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2357a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6598F valueOf(int i) {
        return forNumber(i);
    }
}
