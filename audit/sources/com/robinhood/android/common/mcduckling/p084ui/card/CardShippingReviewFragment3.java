package com.robinhood.android.common.mcduckling.p084ui.card;

import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CardShippingReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"getCardColorText", "", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "feature-lib-mcduckling_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CardShippingReviewFragment3 {

    /* compiled from: CardShippingReviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.mcduckling.ui.card.CardShippingReviewFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardColor.values().length];
            try {
                iArr[CardColor.GREEN_V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardColor.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardColor.BLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardColor.WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardColor.USA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardColor.RHY_VIRTUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardColor.RHY_GREEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardColorText(ApiCardColorOption apiCardColorOption) {
        switch (WhenMappings.$EnumSwitchMapping$0[apiCardColorOption.getColor().ordinal()]) {
            case 1:
            case 2:
                return "Green";
            case 3:
                return "Black";
            case 4:
                return "White";
            case 5:
                return "USA";
            case 6:
            case 7:
                throw new IllegalStateException("RHY cards should not be accessible in CM");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
