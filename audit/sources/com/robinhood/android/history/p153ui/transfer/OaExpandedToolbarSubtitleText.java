package com.robinhood.android.history.p153ui.transfer;

import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfers6;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OaExpandedToolbarSubtitleText.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"oaExpandedToolbarSubtitleText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "isOwner", "", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.transfer.OaExpandedToolbarSubtitleTextKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OaExpandedToolbarSubtitleText {

    /* compiled from: OaExpandedToolbarSubtitleText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.transfer.OaExpandedToolbarSubtitleTextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ StringResource oaExpandedToolbarSubtitleText$default(AchTransfer achTransfer, AchRelationship achRelationship, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return oaExpandedToolbarSubtitleText(achTransfer, achRelationship, z);
    }

    public static final StringResource oaExpandedToolbarSubtitleText(AchTransfer achTransfer, AchRelationship achRelationship, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(achTransfer, "<this>");
        if (achRelationship == null && z) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[achTransfer.getAdjustment().getDirection().ordinal()];
        if (i2 == 1) {
            i = C41787R.string.minerva_transfer_description_deposit_from;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_withdrawal_to;
        }
        Intrinsics.checkNotNull(achRelationship);
        return companion.invoke(i, AchRelationships.getDisplayTitleResource(achRelationship));
    }

    public static /* synthetic */ StringResource oaExpandedToolbarSubtitleText$default(PaymentTransfer paymentTransfer, AchRelationship achRelationship, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return oaExpandedToolbarSubtitleText(paymentTransfer, achRelationship, z);
    }

    public static final StringResource oaExpandedToolbarSubtitleText(PaymentTransfer paymentTransfer, AchRelationship achRelationship, boolean z) {
        int i;
        StringResource nonOwnerExternalAccountDisplayTitle;
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        if (achRelationship == null && z) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getAdjustment().getDirection().ordinal()];
        if (i2 == 1) {
            i = C41787R.string.minerva_transfer_description_deposit_from;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_withdrawal_to;
        }
        if (z) {
            Intrinsics.checkNotNull(achRelationship);
            nonOwnerExternalAccountDisplayTitle = AchRelationships.getDisplayTitleResource(achRelationship);
        } else {
            nonOwnerExternalAccountDisplayTitle = PaymentTransfers6.getNonOwnerExternalAccountDisplayTitle(paymentTransfer);
        }
        return companion.invoke(i, nonOwnerExternalAccountDisplayTitle);
    }
}
