package com.robinhood.android.referral.rewardoffers;

import android.content.Context;
import android.widget.TextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetailsSectionViewType;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.models.serverdriven.api.ApiImageSource;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\r\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0017\u001a\u00020\u0016*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m3636d2 = {"Landroid/widget/TextView;", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;", "apiRewardOfferButtonAction", "Lkotlin/Function1;", "", "action", "bindButtonAction", "(Landroid/widget/TextView;Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferButtonAction;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/android/designsystem/text/RhTextView;", "", "showExpiration", "j$/time/Instant", "expirationDate", "bindExpirationText", "(Lcom/robinhood/android/designsystem/text/RhTextView;ZLj$/time/Instant;)V", "Landroid/content/Context;", "context", "", "expirationDateToText", "(Landroid/content/Context;Lj$/time/Instant;)Ljava/lang/String;", "Lcom/robinhood/models/serverdriven/api/ApiImageSource;", "apiRewardOfferImageSet", "Lokhttp3/HttpUrl;", "getImageUrlBasedOnDensity", "(Landroid/content/Context;Lcom/robinhood/models/serverdriven/api/ApiImageSource;)Lokhttp3/HttpUrl;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "getEntityType", "(Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;)Ljava/lang/String;", "entityType", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;", "(Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetailsSectionViewType;)Ljava/lang/String;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ExtensionsKt {

    /* compiled from: Extensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextsUiExtensions2.values().length];
            try {
                iArr[ContextsUiExtensions2.MDPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextsUiExtensions2.HDPI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextsUiExtensions2.XHDPI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContextsUiExtensions2.XXHDPI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String expirationDateToText(Context context, Instant instant) {
        String string2 = context.getString(C26659R.string.reward_offers_expiration_text, InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) instant));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final HttpUrl getImageUrlBasedOnDensity(Context context, ApiImageSource apiRewardOfferImageSet) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(apiRewardOfferImageSet, "apiRewardOfferImageSet");
        int i = WhenMappings.$EnumSwitchMapping$0[ContextsUiExtensions.getDensitySpec(context).ordinal()];
        if (i == 1) {
            return apiRewardOfferImageSet.getImage1x();
        }
        if (i == 2) {
            return apiRewardOfferImageSet.getImage1x();
        }
        if (i == 3) {
            return apiRewardOfferImageSet.getImage2x();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return apiRewardOfferImageSet.getImage3x();
    }

    public static final String getEntityType(RewardOfferViewType rewardOfferViewType) {
        Intrinsics.checkNotNullParameter(rewardOfferViewType, "<this>");
        return rewardOfferViewType.getType().getServerValue() + "_card";
    }

    public static final String getEntityType(RewardOfferDetailsSectionViewType rewardOfferDetailsSectionViewType) {
        Intrinsics.checkNotNullParameter(rewardOfferDetailsSectionViewType, "<this>");
        return rewardOfferDetailsSectionViewType.getType().getServerValue();
    }

    public static final void bindButtonAction(TextView textView, final ApiRewardOfferButtonAction apiRewardOfferButtonAction, final Function1<? super ApiRewardOfferButtonAction, Unit> action) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (apiRewardOfferButtonAction != null) {
            textView.setVisibility(0);
            textView.setText(apiRewardOfferButtonAction.getDisplay_text());
            OnClickListeners.onClick(textView, new Function0<Unit>() { // from class: com.robinhood.android.referral.rewardoffers.ExtensionsKt.bindButtonAction.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    action.invoke(apiRewardOfferButtonAction);
                }
            });
            return;
        }
        textView.setVisibility(8);
    }

    public static final void bindExpirationText(RhTextView rhTextView, boolean z, Instant instant) {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        if (!z || instant == null) {
            rhTextView.setVisibility(8);
            rhTextView.setText("");
        } else {
            rhTextView.setVisibility(0);
            Context context = rhTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rhTextView.setText(expirationDateToText(context, instant));
        }
    }
}
