package androidx.constraintlayout.core.motion.utils;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.http.HttpStatusCode;

/* loaded from: classes4.dex */
public interface TypedValues {
    int getId(String str);

    boolean setValue(int i, float f);

    boolean setValue(int i, int i2);

    boolean setValue(int i, String str);

    boolean setValue(int i, boolean z);

    public interface AttributesType {
        public static final String[] KEY_WORDS = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "easing":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE;
                case "rotationX":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE;
                case "rotationY":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE;
                case "rotationZ":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE;
                case "translationX":
                    return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE;
                case "translationY":
                    return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE;
                case "translationZ":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE;
                case "progress":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE;
                case "pivotX":
                    return EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE;
                case "pivotY":
                    return EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE;
                case "scaleX":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE;
                case "scaleY":
                    return EnumC7081g.f2774x74902ae0;
                case "target":
                    return 101;
                case "elevation":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE;
                case "alpha":
                    return EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE;
                case "frame":
                    return 100;
                case "curveFit":
                    return EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE;
                case "pathRotate":
                    return 316;
                case "pivotTarget":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE;
                case "visibility":
                    return 302;
                default:
                    return -1;
            }
        }
    }

    public interface CycleType {
        public static final String[] KEY_WORDS = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "easing":
                    return 420;
                case "rotationX":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE;
                case "rotationY":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE;
                case "rotationZ":
                    return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE;
                case "translationX":
                    return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE;
                case "translationY":
                    return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE;
                case "translationZ":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE;
                case "progress":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE;
                case "pivotX":
                    return EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE;
                case "pivotY":
                    return EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE;
                case "scaleX":
                    return EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE;
                case "scaleY":
                    return EnumC7081g.f2774x74902ae0;
                case "alpha":
                    return HttpStatusCode.FORBIDDEN;
                case "curveFit":
                    return 401;
                case "pathRotate":
                    return 416;
                case "visibility":
                    return 402;
                default:
                    return -1;
            }
        }
    }

    public interface PositionType {
        public static final String[] KEY_WORDS = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "transitionEasing":
                    return 501;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502;
                case "sizePercent":
                    return 505;
                case "percentX":
                    return 506;
                case "percentY":
                    return 507;
                default:
                    return -1;
            }
        }
    }

    public interface MotionType {
        public static final String[] KEY_WORDS = {"Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "AnimateCircleAngleTo":
                    return 606;
                case "QuantizeMotionPhase":
                    return 602;
                case "QuantizeMotionSteps":
                    return 610;
                case "PathRotate":
                    return 601;
                case "QuantizeInterpolator":
                    return 604;
                case "DrawPath":
                    return 608;
                case "Stagger":
                    return 600;
                case "PolarRelativeTo":
                    return 609;
                case "QuantizeInterpolatorType":
                    return 611;
                case "QuantizeInterpolatorID":
                    return 612;
                case "TransitionEasing":
                    return 603;
                case "AnimateRelativeTo":
                    return 605;
                case "PathMotionArc":
                    return 607;
                default:
                    return -1;
            }
        }
    }
}
