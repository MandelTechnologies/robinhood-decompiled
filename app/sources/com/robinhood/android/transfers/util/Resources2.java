package com.robinhood.android.transfers.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.banking.util.SpannableUtils;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.createtransfer.MatchaDisplayInfo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Resources.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a<\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, m3636d2 = {"getInstantEligibleAchSecondaryText", "", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "matchaDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "getDebitCardSecondaryText", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.util.ResourcesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Resources2 {
    public static /* synthetic */ CharSequence getInstantEligibleAchSecondaryText$default(Resources resources, Context context, MatchaDisplayInfo matchaDisplayInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            matchaDisplayInfo = null;
        }
        return getInstantEligibleAchSecondaryText(resources, context, matchaDisplayInfo);
    }

    public static final CharSequence getDebitCardSecondaryText(Resources resources, Context context, TransferAccount transferAccount, ApiServiceFeeResponse apiServiceFeeResponse, TransferAccountDirection transferAccountDirection, MatchaDisplayInfo matchaDisplayInfo) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (matchaDisplayInfo != null) {
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            int feeText = matchaDisplayInfo.getFeeText();
            Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) resources.getString(feeText));
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            String grayText = matchaDisplayInfo.getGrayText();
            if (grayText != null) {
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) grayText);
            } else if (apiServiceFeeResponse != null) {
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.transfer_account_fee_template, Money.format$default(Money3.toMoney(apiServiceFeeResponse.getService_fee(), Currencies.USD), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null)));
            }
            SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorPositive), 0);
        } else {
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            Object[] objArr2 = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.transfer_account_instant_transfer_prefix));
            for (int i2 = 0; i2 < 2; i2++) {
                spannableStringBuilder.setSpan(objArr2[i2], length2, spannableStringBuilder.length(), 17);
            }
            if (apiServiceFeeResponse != null) {
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.transfer_account_fee_template, Money.format$default(Money3.toMoney(apiServiceFeeResponse.getService_fee(), Currencies.USD), Locale.US, false, null, false, 0, null, false, null, false, false, 1022, null)));
            } else {
                ApiTransferAccount.TransferAccountStatus status = transferAccount.getStatus();
                ApiTransferAccount.TransferAccountStatus transferAccountStatus = ApiTransferAccount.TransferAccountStatus.APPROVED;
                if (((status == transferAccountStatus && transferAccountDirection == TransferAccountDirection.SINK) || transferAccount.getStatus() != transferAccountStatus) && transferAccount.getDisplayDetail().length() > 0) {
                    spannableStringBuilder.append((CharSequence) " · ");
                    spannableStringBuilder.append((CharSequence) transferAccount.getDisplayDetail());
                }
            }
            SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorPositive), 0);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static final CharSequence getInstantEligibleAchSecondaryText(Resources resources, Context context, MatchaDisplayInfo matchaDisplayInfo) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (matchaDisplayInfo != null) {
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) resources.getString(matchaDisplayInfo.getFeeText()));
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            String grayText = matchaDisplayInfo.getGrayText();
            if (grayText != null) {
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) grayText);
            }
            SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorPositive), 0);
        } else {
            Object[] objArr2 = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.transfer_account_instant_transfer_prefix));
            for (int i2 = 0; i2 < 2; i2++) {
                spannableStringBuilder.setSpan(objArr2[i2], length2, spannableStringBuilder.length(), 17);
            }
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.transfer_account_eligible_suffix));
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static /* synthetic */ CharSequence getDebitCardSecondaryText$default(Resources resources, Context context, TransferAccount transferAccount, ApiServiceFeeResponse apiServiceFeeResponse, TransferAccountDirection transferAccountDirection, MatchaDisplayInfo matchaDisplayInfo, int i, Object obj) {
        if ((i & 8) != 0) {
            transferAccountDirection = null;
        }
        if ((i & 16) != 0) {
            matchaDisplayInfo = null;
        }
        return getDebitCardSecondaryText(resources, context, transferAccount, apiServiceFeeResponse, transferAccountDirection, matchaDisplayInfo);
    }
}
