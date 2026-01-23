package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.models.acats.p299db.AcatsTransfers3;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.shared.models.history.AcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsFormatter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/AcatsTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getPrimaryText", "", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getGoldDepositBoostBadgeTextPosition", "Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter$GoldDepositBoostBadgeTextPosition;", "event", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getAmountText", "getMetadataPrimaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "getLineItems", "", "GoldDepositBoostBadgeTextPosition", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AcatsFormatter extends AbstractMinervaTransactionFormatter<AcatsTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((AcatsTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(AcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getPhase().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(AcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return AcatsTransfers3.getHistoryRowTitle(transaction.getEvent()).getText(getResources());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(AcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().isRejected()) {
            return new TransactionSummary.Badge(getString(C39006R.string.acats_transfer_state_failed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (transaction.getEvent().isExpired()) {
            return new TransactionSummary.Badge(getString(C39006R.string.acats_transfer_state_expired), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        return super.getSummaryBadge((AcatsFormatter) transaction);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AcatsFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter$GoldDepositBoostBadgeTextPosition;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "GONE", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class GoldDepositBoostBadgeTextPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GoldDepositBoostBadgeTextPosition[] $VALUES;
        public static final GoldDepositBoostBadgeTextPosition PRIMARY = new GoldDepositBoostBadgeTextPosition("PRIMARY", 0);
        public static final GoldDepositBoostBadgeTextPosition SECONDARY = new GoldDepositBoostBadgeTextPosition("SECONDARY", 1);
        public static final GoldDepositBoostBadgeTextPosition GONE = new GoldDepositBoostBadgeTextPosition("GONE", 2);

        private static final /* synthetic */ GoldDepositBoostBadgeTextPosition[] $values() {
            return new GoldDepositBoostBadgeTextPosition[]{PRIMARY, SECONDARY, GONE};
        }

        public static EnumEntries<GoldDepositBoostBadgeTextPosition> getEntries() {
            return $ENTRIES;
        }

        private GoldDepositBoostBadgeTextPosition(String str, int i) {
        }

        static {
            GoldDepositBoostBadgeTextPosition[] goldDepositBoostBadgeTextPositionArr$values = $values();
            $VALUES = goldDepositBoostBadgeTextPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(goldDepositBoostBadgeTextPositionArr$values);
        }

        public static GoldDepositBoostBadgeTextPosition valueOf(String str) {
            return (GoldDepositBoostBadgeTextPosition) Enum.valueOf(GoldDepositBoostBadgeTextPosition.class, str);
        }

        public static GoldDepositBoostBadgeTextPosition[] values() {
            return (GoldDepositBoostBadgeTextPosition[]) $VALUES.clone();
        }
    }

    private final GoldDepositBoostBadgeTextPosition getGoldDepositBoostBadgeTextPosition(AcatsTransfer event) {
        GoldDepositBoostTransferDetail goldDepositBoost = event.getGoldDepositBoost();
        if ((goldDepositBoost != null ? goldDepositBoost.getBadgeText() : null) == null) {
            return GoldDepositBoostBadgeTextPosition.GONE;
        }
        StringResource historyRowValueDetail = AcatsTransfers3.getHistoryRowValueDetail(event);
        if ((historyRowValueDetail != null ? historyRowValueDetail.getText(getResources()) : null) == null) {
            return GoldDepositBoostBadgeTextPosition.PRIMARY;
        }
        StringResource historyRowValueDetailSubtitle = AcatsTransfers3.getHistoryRowValueDetailSubtitle(event);
        if ((historyRowValueDetailSubtitle != null ? historyRowValueDetailSubtitle.getText(getResources()) : null) != null) {
            return GoldDepositBoostBadgeTextPosition.GONE;
        }
        return GoldDepositBoostBadgeTextPosition.SECONDARY;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(AcatsTransaction transaction) {
        CharSequence text;
        GoldDepositBoostTransferDetail goldDepositBoost;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AcatsTransfer event = transaction.getEvent();
        String badgeText = null;
        if (getGoldDepositBoostBadgeTextPosition(event) == GoldDepositBoostBadgeTextPosition.PRIMARY && (goldDepositBoost = event.getGoldDepositBoost()) != null) {
            badgeText = goldDepositBoost.getBadgeText();
        }
        StringResource historyRowValueDetail = AcatsTransfers3.getHistoryRowValueDetail(event);
        return (historyRowValueDetail == null || (text = historyRowValueDetail.getText(getResources())) == null) ? badgeText != null ? badgeText : super.getAmountText((AcatsFormatter) transaction) : text;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataPrimaryTextIcon(AcatsTransaction transaction) {
        GoldDepositBoostTransferDetail goldDepositBoost;
        ServerToBentoAssetMapper2 iconAsset;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AcatsTransfer event = transaction.getEvent();
        if (getGoldDepositBoostBadgeTextPosition(event) == GoldDepositBoostBadgeTextPosition.PRIMARY && (goldDepositBoost = event.getGoldDepositBoost()) != null && (iconAsset = goldDepositBoost.getIconAsset()) != null) {
            return new TransactionSummary.Icon(iconAsset, TransactionSummary.Tint.SOL_LIGHT);
        }
        return super.getMetadataPrimaryTextIcon((AcatsFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(AcatsTransaction transaction) {
        SpannedString spannedString;
        GoldDepositBoostTransferDetail goldDepositBoost;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        StringResource historyRowValueDetailSubtitle = AcatsTransfers3.getHistoryRowValueDetailSubtitle(transaction.getEvent());
        String badgeText = null;
        CharSequence text = historyRowValueDetailSubtitle != null ? historyRowValueDetailSubtitle.getText(getResources()) : null;
        if (text != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_PRIMARY());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(text);
            spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            spannedString = null;
        }
        if (getGoldDepositBoostBadgeTextPosition(transaction.getEvent()) == GoldDepositBoostBadgeTextPosition.SECONDARY && (goldDepositBoost = transaction.getEvent().getGoldDepositBoost()) != null) {
            badgeText = goldDepositBoost.getBadgeText();
        }
        return spannedString != null ? spannedString : badgeText != null ? badgeText : super.getMetadataSecondaryText((AcatsFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(AcatsTransaction transaction) {
        GoldDepositBoostTransferDetail goldDepositBoost;
        ServerToBentoAssetMapper2 iconAsset;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (getGoldDepositBoostBadgeTextPosition(transaction.getEvent()) == GoldDepositBoostBadgeTextPosition.SECONDARY && (goldDepositBoost = transaction.getEvent().getGoldDepositBoost()) != null && (iconAsset = goldDepositBoost.getIconAsset()) != null) {
            return new TransactionSummary.Icon(iconAsset, TransactionSummary.Tint.SOL_LIGHT);
        }
        return super.getMetadataSecondaryTextIcon((AcatsFormatter) transaction);
    }

    public Void getLineItems(AcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Acats transfers currently have their own history detail");
    }
}
