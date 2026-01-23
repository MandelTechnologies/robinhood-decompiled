package com.robinhood.android.lib.pathfinder.extensions;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.android.lib.pathfinder.extensions.ImageTypes;
import com.robinhood.models.api.pathfinder.contexts.ImageType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toRenderType", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType;", "Lcom/robinhood/models/api/pathfinder/contexts/ImageType;", "isDay", "", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageTypesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ImageTypes2 {

    /* compiled from: ImageTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageType.values().length];
            try {
                iArr[ImageType.THUMBS_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageType.REACTIVATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageType.SAD_BOY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageType.TICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageType.CAUTION_TUBE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageType.CUSTOMER_VERIFICATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageType.PENDING_APPLICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageType.FLOATING_DOLLAR_DEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ImageType.HOUR_GLASS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ImageType.HOUR_GLASS_BLUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ImageType.HOURGLASS_ANIMATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ImageType.DEBIT_CARD_ANIMATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ImageType.BLOCKED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ImageType.CONTROL_CENTER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ImageType.FLASHLIGHT_ON_PERSON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ImageType.PHONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ImageType.CAUTION_TUBE_YELLOW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ImageType.FAQ.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ImageType.BROKERAGE_ACCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ImageType.SPENDING_ACCOUNT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ImageType.DEBIT_CARD_SPENDING.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ImageType.BALL_CONTRAPTION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ImageType.GUIDE_SUGGESTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ImageType.PENDING_APPLICATION_BLUE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ImageType.LIVE_AGENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ImageType.LOOKING_FOR_DOCUMENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ImageType.PERSON_IDENTITY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ImageType.VIRTUAL_ASSISTANT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ImageType.UPDATE_APP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ImageType.CASH_ACCT_SWITCH.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ImageType.MARGIN_ACCT_SWITCH.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ImageType.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageTypes toRenderType(ImageType imageType, boolean z) {
        Intrinsics.checkNotNullParameter(imageType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[imageType.ordinal()]) {
            case 1:
                return new ImageTypes.Drawable(C20366R.drawable.svg_thumbs_up);
            case 2:
                return new ImageTypes.Drawable(C20366R.drawable.svg_reactivation);
            case 3:
                return new ImageTypes.Drawable(C20366R.drawable.svg_sad_boy);
            case 4:
                return new ImageTypes.Drawable(C20366R.drawable.svg_tick);
            case 5:
                return new ImageTypes.Drawable(C20366R.drawable.svg_caution_tube);
            case 6:
                return new ImageTypes.Drawable(C20366R.drawable.svg_customer_verification);
            case 7:
                return new ImageTypes.Drawable(C20366R.drawable.svg_pending_application);
            case 8:
                return new ImageTypes.Drawable(C20366R.drawable.svg_floating_dollar_device);
            case 9:
                return new ImageTypes.Drawable(C20366R.drawable.svg_hour_glass);
            case 10:
                return new ImageTypes.Drawable(C20366R.drawable.svg_hour_glass_blue);
            case 11:
                return new ImageTypes.Lottie(C11048R.raw.lottie_hour_glass);
            case 12:
                return new ImageTypes.Lottie(C20366R.raw.lottie_debit_card);
            case 13:
                return new ImageTypes.Drawable(C20366R.drawable.svg_blocked);
            case 14:
                return new ImageTypes.Drawable(C20366R.drawable.svg_control_center);
            case 15:
                return new ImageTypes.Drawable(C20366R.drawable.svg_flashlight_on_person);
            case 16:
                return new ImageTypes.Drawable(C20366R.drawable.svg_phone);
            case 17:
                return new ImageTypes.Drawable(C20366R.drawable.svg_caution_tube_yellow);
            case 18:
                if (z) {
                    return new ImageTypes.Drawable(C20366R.drawable.svg_faq);
                }
                return new ImageTypes.Drawable(C20366R.drawable.svg_faq_dark);
            case 19:
                return new ImageTypes.Drawable(C20366R.drawable.svg_brokerage_account);
            case 20:
                return new ImageTypes.Drawable(C20366R.drawable.svg_spending_account);
            case 21:
                return new ImageTypes.Drawable(C20366R.drawable.svg_debit_card_spending);
            case 22:
                return new ImageTypes.Drawable(C20366R.drawable.svg_ball_contraption);
            case 23:
                return new ImageTypes.Drawable(C20366R.drawable.svg_guide_suggestion);
            case 24:
                return new ImageTypes.Drawable(C20366R.drawable.svg_pending_application_blue);
            case 25:
                return new ImageTypes.Drawable(C20366R.drawable.svg_live_agent);
            case 26:
                return new ImageTypes.Drawable(C20366R.drawable.svg_looking_for_document);
            case 27:
                return new ImageTypes.Drawable(C20366R.drawable.svg_person_identity);
            case 28:
                return new ImageTypes.Drawable(C20366R.drawable.svg_virtual_assistant);
            case 29:
                return new ImageTypes.Drawable(C20366R.drawable.svg_update_app);
            case 30:
            case 31:
            case 32:
                return ImageTypes.None.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
