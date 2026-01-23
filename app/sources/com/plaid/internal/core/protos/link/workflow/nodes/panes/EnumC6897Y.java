package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Y */
/* loaded from: classes24.dex */
public enum EnumC6897Y implements Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);

    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2525b = new a();

    /* renamed from: a */
    public final int f2527a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Y$a */
    public class a implements Internal.EnumLiteMap<EnumC6897Y> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6897Y.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Y$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2528a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6897Y.forNumber(i) != null;
        }
    }

    EnumC6897Y(int i) {
        this.f2527a = i;
    }

    public static EnumC6897Y forNumber(int i) {
        if (i == 0) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
        }
        if (i == 1) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        if (i != 2) {
            return null;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
    }

    public static Internal.EnumLiteMap<EnumC6897Y> internalGetValueMap() {
        return f2525b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2528a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2527a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6897Y valueOf(int i) {
        return forNumber(i);
    }
}
