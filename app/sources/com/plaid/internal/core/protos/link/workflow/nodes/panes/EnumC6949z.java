package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z */
/* loaded from: classes24.dex */
public enum EnumC6949z implements Internal.EnumLite {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_BUTTON_NAVIGATION(1),
    HAPTIC_TYPE_BUTTON_INPUT(2),
    HAPTIC_TYPE_BUTTON_ACTION(3),
    HAPTIC_TYPE_EVENT_SUCCESS(4),
    HAPTIC_TYPE_EVENT_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int HAPTIC_TYPE_BUTTON_ACTION_VALUE = 3;
    public static final int HAPTIC_TYPE_BUTTON_INPUT_VALUE = 2;
    public static final int HAPTIC_TYPE_BUTTON_NAVIGATION_VALUE = 1;
    public static final int HAPTIC_TYPE_EVENT_ERROR_VALUE = 5;
    public static final int HAPTIC_TYPE_EVENT_SUCCESS_VALUE = 4;
    public static final int HAPTIC_TYPE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2620b = new a();

    /* renamed from: a */
    public final int f2622a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$a */
    public class a implements Internal.EnumLiteMap<EnumC6949z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6949z.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2623a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6949z.forNumber(i) != null;
        }
    }

    EnumC6949z(int i) {
        this.f2622a = i;
    }

    public static EnumC6949z forNumber(int i) {
        if (i == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return HAPTIC_TYPE_BUTTON_NAVIGATION;
        }
        if (i == 2) {
            return HAPTIC_TYPE_BUTTON_INPUT;
        }
        if (i == 3) {
            return HAPTIC_TYPE_BUTTON_ACTION;
        }
        if (i == 4) {
            return HAPTIC_TYPE_EVENT_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return HAPTIC_TYPE_EVENT_ERROR;
    }

    public static Internal.EnumLiteMap<EnumC6949z> internalGetValueMap() {
        return f2620b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2623a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2622a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6949z valueOf(int i) {
        return forNumber(i);
    }
}
