package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuOfOptionsAssetMappers.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"drawableRes", "", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;", "isDay", "", "drawableResTint", "getDrawableResTint", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;)Ljava/lang/Integer;", "drawableResColor", "Landroidx/compose/ui/graphics/Color;", "getDrawableResColor", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsAsset;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "iconRes", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsPathDecoration;", "getIconRes", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsPathDecoration;)I", "lib-menu-of-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsAssetMappersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MenuOfOptionsAssetMappers {

    /* compiled from: MenuOfOptionsAssetMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsAssetMappersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SortingHatTypes.values().length];
            try {
                iArr[SortingHatTypes.FINISH_SIGNUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortingHatTypes.VERIFY_IDENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortingHatTypes.BANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortingHatTypes.UNDER_REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SortingHatTypes.VERIFY_BANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SortingHatTypes.GIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SortingHatTypes.WELCOME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SortingHatTypes.CAUTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SortingHatTypes.EMPHASIZED_CAUTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SortingHatTypes.EMPHASIZED_COMPLETE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SortingHatTypes.GIFT_NEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SortingHatTypes.STONKS_BANNER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SortingHatTypes.WELCOME_NEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SortingHatTypes.MONEY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SortingHatTypes.ROBOT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SortingHatTypes.FINISH_SIGNUP_CRYPTO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SortingHatTypes.VERIFY_IDENTITY_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SortingHatTypes.UNDER_REVIEW_CRYPTO.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SortingHatTypes.GIFT_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SortingHatTypes.IDENTITY_CARD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SortingHatTypes.JOINT_ACCOUNT_RINGS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SortingHatTypes.JOINT_ACCOUNT_BALLOON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SortingHatTypes.BUY_CRYPTO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SortingHatTypes.FUND_ACCOUNT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SortingHatTypes.FUND_ACCOUNT_CRYPTO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SortingHatTypes.TRANSFER_CRYPTO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SortingHatTypes.TRADE_CRYPTO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SortingHatTypes.GET_STARTED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[SortingHatTypes.FINISH_SIGNUP_REBRAND.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[SortingHatTypes.VERIFY_IDENTITY_REBRAND.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[SortingHatTypes.GIFT_REBRAND.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[SortingHatTypes.WELCOME_REBRAND.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[SortingHatTypes.WELCOME_HERO_REBRAND.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[SortingHatTypes.BANK_REBRAND.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[SortingHatTypes.GET_STARTED_REBRAND.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[SortingHatTypes.JOINT_ACCOUNT_RINGS_REBRAND.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[SortingHatTypes.IDENTITY_CARD_REBRAND.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[SortingHatTypes.INVESTMENT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[SortingHatTypes.ACCOUNT_TRANSFERS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[SortingHatTypes.CHECKMARK.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[SortingHatTypes.ADD_MONEY.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[SortingHatTypes.FIND_YOUR_FIRST_TRADE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SortingHatTypes3.values().length];
            try {
                iArr2[SortingHatTypes3.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[SortingHatTypes3.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[SortingHatTypes3.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[SortingHatTypes3.CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[SortingHatTypes3.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int drawableRes(SortingHatTypes sortingHatTypes, boolean z) {
        Intrinsics.checkNotNullParameter(sortingHatTypes, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sortingHatTypes.ordinal()]) {
            case 1:
                return C39252R.drawable.svg_finish_sign_up_hero;
            case 2:
                return C39252R.drawable.svg_verify_identity_hero;
            case 3:
                return C39252R.drawable.svg_bank_hero;
            case 4:
                return C39252R.drawable.svg_under_review;
            case 5:
                return C39252R.drawable.svg_verify_bank;
            case 6:
                return C39252R.drawable.svg_gift_hero;
            case 7:
                return C39252R.drawable.svg_welcome_to_robinhood;
            case 8:
                return C11048R.drawable.svg_error_triangle;
            case 9:
                return C11048R.drawable.svg_emphasized_caution_tube;
            case 10:
                return C11048R.drawable.svg_emphasized_checkmark;
            case 11:
                return C39252R.drawable.svg_gift_new;
            case 12:
                return C39252R.drawable.svg_progressive_onboarding_header;
            case 13:
                return C39252R.drawable.svg_welcome_new;
            case 14:
                return C39252R.drawable.svg_money;
            case 15:
                return C39252R.drawable.svg_robot;
            case 16:
                return C39252R.drawable.svg_finish_signup_crypto;
            case 17:
                return C39252R.drawable.svg_verify_identity_crypto;
            case 18:
                return C39252R.drawable.svg_under_review_crypto;
            case 19:
                return C39252R.drawable.svg_gift_crypto;
            case 20:
                return C39252R.drawable.svg_identity_card;
            case 21:
                return C39252R.drawable.svg_joint_account_rings;
            case 22:
                return C39252R.drawable.svg_joint_account_balloon;
            case 23:
                return C39252R.drawable.svg_buy_crypto;
            case 24:
                return C39252R.drawable.svg_fund_account;
            case 25:
                return C39252R.drawable.svg_fund_account_crypto;
            case 26:
                return C39252R.drawable.svg_transfer_crypto;
            case 27:
                return C39252R.drawable.svg_trade_crypto;
            case 28:
                if (z) {
                    return C39252R.drawable.svg_get_started;
                }
                return C39252R.drawable.svg_get_started_dark;
            case 29:
                if (z) {
                    return C39252R.drawable.svg_finish_sign_up_rebrand_light;
                }
                return C39252R.drawable.svg_finish_sign_up_rebrand_dark;
            case 30:
                if (z) {
                    return C39252R.drawable.svg_verify_identity_rebrand_light;
                }
                return C39252R.drawable.svg_verify_identity_rebrand_dark;
            case 31:
                if (z) {
                    return C39252R.drawable.svg_gift_rebrand_light;
                }
                return C39252R.drawable.svg_gift_rebrand_dark;
            case 32:
                if (z) {
                    return C39252R.drawable.svg_welcome_rebrand_light;
                }
                return C39252R.drawable.svg_welcome_rebrand_dark;
            case 33:
                if (z) {
                    return C39252R.drawable.svg_welcome_hero_rebrand_light;
                }
                return C39252R.drawable.svg_welcome_hero_rebrand_dark;
            case 34:
                if (z) {
                    return C39252R.drawable.svg_bank_rebrand_light;
                }
                return C39252R.drawable.svg_bank_rebrand_dark;
            case 35:
                if (z) {
                    return C39252R.drawable.svg_get_started_rebrand_light;
                }
                return C39252R.drawable.svg_get_started_rebrand_dark;
            case 36:
                if (z) {
                    return C39252R.drawable.svg_joint_account_rings_rebrand_light;
                }
                return C39252R.drawable.svg_joint_account_rings_rebrand_dark;
            case 37:
                if (z) {
                    return C39252R.drawable.svg_identity_card_rebrand_light;
                }
                return C39252R.drawable.svg_identity_card_rebrand_dark;
            case 38:
                return C39252R.drawable.svg_investment;
            case 39:
                return C39252R.drawable.svg_account_transfer;
            case 40:
                return C39252R.drawable.svg_checkmark;
            case 41:
                if (z) {
                    return C39252R.drawable.svg_add_money_light;
                }
                return C39252R.drawable.svg_add_money_dark;
            case 42:
                if (z) {
                    return C39252R.drawable.svg_find_your_first_trade_light;
                }
                return C39252R.drawable.svg_find_your_first_trade_dark;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Integer getDrawableResTint(SortingHatTypes sortingHatTypes) {
        Intrinsics.checkNotNullParameter(sortingHatTypes, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortingHatTypes.ordinal()];
        if (i != 23 && i != 38) {
            switch (i) {
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    switch (i) {
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            return null;
                    }
            }
        }
        return Integer.valueOf(C20690R.attr.colorForeground1);
    }

    @JvmName
    public static final Color getDrawableResColor(SortingHatTypes sortingHatTypes, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sortingHatTypes, "<this>");
        composer.startReplaceGroup(2094288511);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2094288511, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.<get-drawableResColor> (MenuOfOptionsAssetMappers.kt:127)");
        }
        Color colorM6701boximpl = (sortingHatTypes == SortingHatTypes.FINISH_SIGNUP_CRYPTO || sortingHatTypes == SortingHatTypes.VERIFY_IDENTITY_CRYPTO || sortingHatTypes == SortingHatTypes.UNDER_REVIEW_CRYPTO || sortingHatTypes == SortingHatTypes.GIFT_CRYPTO || sortingHatTypes == SortingHatTypes.BUY_CRYPTO || sortingHatTypes == SortingHatTypes.FUND_ACCOUNT_CRYPTO || sortingHatTypes == SortingHatTypes.TRANSFER_CRYPTO || sortingHatTypes == SortingHatTypes.TRADE_CRYPTO || sortingHatTypes == SortingHatTypes.INVESTMENT) ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorM6701boximpl;
    }

    public static final int getIconRes(SortingHatTypes3 sortingHatTypes3) {
        Intrinsics.checkNotNullParameter(sortingHatTypes3, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[sortingHatTypes3.ordinal()];
        if (i == 1) {
            return C39252R.drawable.ic_user_journey_active_decoration;
        }
        if (i == 2) {
            return C39252R.drawable.ic_user_journey_inactive_decoration;
        }
        if (i == 3) {
            return C39252R.drawable.ic_user_journey_pending_decoration;
        }
        if (i == 4) {
            return C39252R.drawable.ic_user_journey_verify_bank_decoration;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C39252R.drawable.ic_user_journey_completed_decoration;
    }
}
