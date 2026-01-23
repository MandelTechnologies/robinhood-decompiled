package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.i */
/* loaded from: classes24.dex */
public enum EnumC7029i implements Internal.EnumLite {
    INTEGRATION_MODE_UNKNOWN(0),
    INTEGRATION_MODE_IFRAME(1),
    INTEGRATION_MODE_WEBVIEW(2),
    INTEGRATION_MODE_IOS_SDK_WEBVIEW(3),
    INTEGRATION_MODE_ANDROID_SDK_WEBVIEW(4),
    INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW(5),
    INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW(6),
    INTEGRATION_MODE_TAB_WINDOW(7),
    INTEGRATION_MODE_REDIRECT_URI(8),
    INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END(9),
    UNRECOGNIZED(-1);

    public static final int INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 6;
    public static final int INTEGRATION_MODE_ANDROID_SDK_WEBVIEW_VALUE = 4;
    public static final int INTEGRATION_MODE_IFRAME_VALUE = 1;
    public static final int INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 5;
    public static final int INTEGRATION_MODE_IOS_SDK_WEBVIEW_VALUE = 3;
    public static final int INTEGRATION_MODE_REDIRECT_URI_VALUE = 8;
    public static final int INTEGRATION_MODE_TAB_WINDOW_VALUE = 7;
    public static final int INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END_VALUE = 9;
    public static final int INTEGRATION_MODE_UNKNOWN_VALUE = 0;
    public static final int INTEGRATION_MODE_WEBVIEW_VALUE = 2;

    /* renamed from: b */
    public static final a f2671b = new a();

    /* renamed from: a */
    public final int f2673a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.i$a */
    public class a implements Internal.EnumLiteMap<EnumC7029i> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7029i.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.i$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2674a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7029i.forNumber(i) != null;
        }
    }

    EnumC7029i(int i) {
        this.f2673a = i;
    }

    public static EnumC7029i forNumber(int i) {
        switch (i) {
            case 0:
                return INTEGRATION_MODE_UNKNOWN;
            case 1:
                return INTEGRATION_MODE_IFRAME;
            case 2:
                return INTEGRATION_MODE_WEBVIEW;
            case 3:
                return INTEGRATION_MODE_IOS_SDK_WEBVIEW;
            case 4:
                return INTEGRATION_MODE_ANDROID_SDK_WEBVIEW;
            case 5:
                return INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 6:
                return INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 7:
                return INTEGRATION_MODE_TAB_WINDOW;
            case 8:
                return INTEGRATION_MODE_REDIRECT_URI;
            case 9:
                return INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC7029i> internalGetValueMap() {
        return f2671b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2674a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2673a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7029i valueOf(int i) {
        return forNumber(i);
    }
}
