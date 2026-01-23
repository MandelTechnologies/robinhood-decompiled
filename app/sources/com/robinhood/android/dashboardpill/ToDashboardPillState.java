package com.robinhood.android.dashboardpill;

import com.robinhood.android.dashboardpill.DashboardPillData3;
import com.robinhood.android.dashboardpill.DashboardPillData4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.referral.contracts.RewardOfferIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import p479j$.time.Instant;

/* compiled from: ToDashboardPillState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, m3636d2 = {"toDashboardPillState", "Lcom/robinhood/android/dashboardpill/DashboardPillState;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "toDto", "Lcom/robinhood/android/dashboardpill/VisualStyle;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "customStyleParams", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "lib-dashboard-pill_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboardpill.ToDashboardPillStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ToDashboardPillState {

    /* compiled from: ToDashboardPillState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboardpill.ToDashboardPillStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetBadgeDataResponseDto.BadgeVisualStyleDto.values().length];
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.CRYPTO_LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.MARKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GetBadgeDataResponseDto.BadgeVisualStyleDto.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DashboardPillData3 toDashboardPillState(GetBadgeDataResponseDto.BadgeDataDto badgeDataDto) {
        if (badgeDataDto instanceof GetBadgeDataResponseDto.BadgeDataDto.CountdownBadge) {
            GetBadgeDataResponseDto.BadgeDataDto.CountdownBadge countdownBadge = (GetBadgeDataResponseDto.BadgeDataDto.CountdownBadge) badgeDataDto;
            Instant target_timestamp = countdownBadge.getValue().getTarget_timestamp();
            DashboardPillData4 dto = toDto(countdownBadge.getValue().getStyle(), countdownBadge.getValue().getCustom_style_params());
            boolean zIs_pulsing = countdownBadge.getValue().is_pulsing();
            String logging_identifier = countdownBadge.getValue().getLogging_identifier();
            String str = logging_identifier == null ? "" : logging_identifier;
            String icon_name = countdownBadge.getValue().getIcon_name();
            if (StringsKt.isBlank(icon_name)) {
                icon_name = null;
            }
            return new DashboardPillData3.Visible(new DashboardPillData(target_timestamp, dto, zIs_pulsing, str, null, icon_name != null ? ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon_name) : null, countdownBadge.getValue().getCompletion_text(), ServerToBentoAssetMapper2.INSTANCE.fromServerValue(countdownBadge.getValue().getCompletion_icon()), countdownBadge.getValue().getLottie_url_light(), countdownBadge.getValue().getLottie_url_dark(), countdownBadge.getValue().getBg_lottie_url_light(), countdownBadge.getValue().getBg_lottie_url_dark(), countdownBadge.getValue().getBorder_lottie_url_light(), countdownBadge.getValue().getBorder_lottie_url_dark(), new RewardOfferIntentKey.Platform("dashboard_pill", null, null, false, false, null, 62, null), countdownBadge.getValue().getAction_url(), null, null, 196608, null));
        }
        if (badgeDataDto instanceof GetBadgeDataResponseDto.BadgeDataDto.TextBadge) {
            GetBadgeDataResponseDto.BadgeDataDto.TextBadge textBadge = (GetBadgeDataResponseDto.BadgeDataDto.TextBadge) badgeDataDto;
            DashboardPillData4 dto2 = toDto(textBadge.getValue().getStyle(), textBadge.getValue().getCustom_style_params());
            String logging_identifier2 = textBadge.getValue().getLogging_identifier();
            return new DashboardPillData3.Visible(new DashboardPillData(null, dto2, textBadge.getValue().is_pulsing(), logging_identifier2 == null ? "" : logging_identifier2, textBadge.getValue().getContent(), ServerToBentoAssetMapper2.INSTANCE.fromServerValue(textBadge.getValue().getIcon_name()), null, null, textBadge.getValue().getLottie_url_light(), textBadge.getValue().getLottie_url_dark(), textBadge.getValue().getBg_lottie_url_light(), textBadge.getValue().getBg_lottie_url_dark(), textBadge.getValue().getBorder_lottie_url_light(), textBadge.getValue().getBorder_lottie_url_dark(), new RewardOfferIntentKey.Platform("dashboard_pill", null, null, false, false, null, 62, null), textBadge.getValue().getAction_url(), textBadge.getValue().getBadge_identifier(), textBadge.getValue().is_notification_dot_visible(), 192, null));
        }
        if (!(badgeDataDto instanceof GetBadgeDataResponseDto.BadgeDataDto.NoBadge) && badgeDataDto != null) {
            throw new NoWhenBranchMatchedException();
        }
        return DashboardPillData3.Hidden.INSTANCE;
    }

    private static final DashboardPillData4 toDto(GetBadgeDataResponseDto.BadgeVisualStyleDto badgeVisualStyleDto, GetBadgeDataResponseDto.CustomStyleParamsDto customStyleParamsDto) {
        switch (WhenMappings.$EnumSwitchMapping$0[badgeVisualStyleDto.ordinal()]) {
            case 1:
                return DashboardPillData4.Gold.INSTANCE;
            case 2:
                return DashboardPillData4.Standard.INSTANCE;
            case 3:
                return DashboardPillData4.Crypto.INSTANCE;
            case 4:
                return DashboardPillData4.CryptoLive.INSTANCE;
            case 5:
                return DashboardPillData4.Market.INSTANCE;
            case 6:
                if (customStyleParamsDto != null) {
                    return new DashboardPillData4.Custom(customStyleParamsDto.getText_color(), customStyleParamsDto.getText_color(), customStyleParamsDto.getPulsating_color(), customStyleParamsDto.getBackground_color(), null, customStyleParamsDto.getBorder_color());
                }
                return DashboardPillData4.Standard.INSTANCE;
            default:
                return DashboardPillData4.Standard.INSTANCE;
        }
    }
}
