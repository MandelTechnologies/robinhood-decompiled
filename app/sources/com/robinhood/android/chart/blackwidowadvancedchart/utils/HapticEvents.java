package com.robinhood.android.chart.blackwidowadvancedchart.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticStyleDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HapticEvents.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0012"}, m3636d2 = {"clockTickEvent", "", "view", "Landroid/view/View;", "mediumHapticEvent", "context", "Landroid/content/Context;", "orderSubmittedHapticEvent", "orderFilledHapticEvent", "yAxisHapticEvent", "toLatestCandleHapticEvent", "handleHapticEvents", "hapticEventStyle", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyleDto;", "hapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "onSuccessHapticEvent", "onRejectHapticEvent", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEventsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HapticEvents {

    /* compiled from: HapticEvents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEventsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HapticStyleDto.values().length];
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_CUSTOM_ORDER_FILLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_CUSTOM_Y_AXIS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_CUSTOM_LATEST_CANDLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HapticStyleDto.HAPTIC_STYLE_UNSPECIFIED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void clockTickEvent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Build.VERSION.SDK_INT >= 30) {
            view.performHapticFeedback(4);
        }
    }

    public static final void mediumHapticEvent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.createOneShot(5L, 90));
        }
    }

    public static final void orderSubmittedHapticEvent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.startComposition().addPrimitive(5, 0.9f).compose());
        }
    }

    public static final void orderFilledHapticEvent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.startComposition().addPrimitive(1, 0.45f).addPrimitive(6, 0.3f).addPrimitive(4, 0.3f, 0).addPrimitive(1, 0.6f, 50).addPrimitive(5, 0.2f, 0).compose());
        }
    }

    public static final void yAxisHapticEvent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.startComposition().addPrimitive(4, 0.25f).addPrimitive(1, 0.75f, 0).addPrimitive(6, 0.25f, 0).addPrimitive(1, 0.75f, 0).compose());
        }
    }

    public static final void toLatestCandleHapticEvent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            ((Vibrator) context.getSystemService(Vibrator.class)).vibrate(VibrationEffect.startComposition().addPrimitive(6, 0.15f).addPrimitive(2, 0.55f, 0).compose());
        }
    }

    public static final void handleHapticEvents(HapticStyleDto hapticEventStyle, HapticFeedback hapticFeedback, Context context, View view) {
        Intrinsics.checkNotNullParameter(hapticEventStyle, "hapticEventStyle");
        Intrinsics.checkNotNullParameter(hapticFeedback, "hapticFeedback");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        switch (WhenMappings.$EnumSwitchMapping$0[hapticEventStyle.ordinal()]) {
            case 1:
                hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                return;
            case 2:
                mediumHapticEvent(context);
                return;
            case 3:
                hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                return;
            case 4:
                onSuccessHapticEvent(view);
                return;
            case 5:
                onRejectHapticEvent(view);
                return;
            case 6:
                orderSubmittedHapticEvent(context);
                return;
            case 7:
                orderFilledHapticEvent(context);
                return;
            case 8:
                yAxisHapticEvent(context);
                return;
            case 9:
                toLatestCandleHapticEvent(context);
                return;
            case 10:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void onSuccessHapticEvent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Build.VERSION.SDK_INT >= 30) {
            view.performHapticFeedback(16);
        }
    }

    public static final void onRejectHapticEvent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Build.VERSION.SDK_INT >= 30) {
            view.performHapticFeedback(17);
        }
    }
}
