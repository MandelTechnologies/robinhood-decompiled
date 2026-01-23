package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import com.robinhood.android.banking.util.AutomaticDepositFrequencies;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.UiAutomaticDeposits;
import com.robinhood.android.transfers.recurring.p270ui.experiment.hub.RecurringDepositHubViewState;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.cashier.DepositScheduleType;
import com.robinhood.models.api.cashier.ExtraCashDepositScheduleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: RecurringDepositHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\n*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u0004\u0018\u00010\n*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a%\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "infoBanner", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;Landroid/content/res/Resources;)Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "j$/time/LocalDate", "now", "expirationDate", "", "labelPillForRecurringExtraCash", "(Landroid/content/res/Resources;Lj$/time/LocalDate;Lj$/time/LocalDate;)Ljava/lang/String;", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Section;", "toSections", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;Lj$/time/Clock;Landroid/content/res/Resources;)Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;", "Lcom/robinhood/models/db/Account;", "associatedBrokerageAccount", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;", "toRow", "(Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;Lcom/robinhood/models/db/Account;Lj$/time/Clock;Landroid/content/res/Resources;)Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;", "Lcom/robinhood/models/db/AutomaticDeposit;", "titlePrimaryText", "(Lcom/robinhood/models/db/AutomaticDeposit;Landroid/content/res/Resources;)Ljava/lang/String;", "titleSecondaryText", "Landroidx/compose/ui/text/AnnotatedString;", "secondSubtitle", "(Lcom/robinhood/models/db/AutomaticDeposit;Lj$/time/Clock;Landroid/content/res/Resources;)Landroidx/compose/ui/text/AnnotatedString;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositHubStateProvider2 {
    public static final InfoBanner<GenericAction> infoBanner(RecurringDepositHubDataState recurringDepositHubDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(recurringDepositHubDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        List<AutomaticDepositWithBankInfo> automaticDeposits = recurringDepositHubDataState.getAutomaticDeposits();
        if ((automaticDeposits instanceof Collection) && automaticDeposits.isEmpty()) {
            return null;
        }
        Iterator<T> it = automaticDeposits.iterator();
        while (it.hasNext()) {
            if (((AutomaticDepositWithBankInfo) it.next()).getAutomaticDeposit().getExtraCashDepositScheduleState() == ExtraCashDepositScheduleState.EXPIRED) {
                Icon icon = Icon.TRIANGLE_ALERT_24;
                String string2 = resources.getString(C30439R.string.recurring_deposit_extra_cash_expired_banner_text);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return new InfoBanner<>(null, new RichText(string2, CollectionsKt.emptyList()), icon, null, null, false, null, null, null, 505, null);
            }
        }
        return null;
    }

    public static final String labelPillForRecurringExtraCash(Resources resources, LocalDate now, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        if (now.compareTo((ChronoLocalDate) expirationDate) < 0) {
            return resources.getString(C30439R.string.general_label_new);
        }
        return null;
    }

    public static final ImmutableList3<RecurringDepositHubViewState.Section> toSections(RecurringDepositHubDataState recurringDepositHubDataState, Clock clock, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(recurringDepositHubDataState, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        ArrayList arrayList = new ArrayList();
        List<AutomaticDepositWithBankInfo> automaticDeposits = recurringDepositHubDataState.getAutomaticDeposits();
        ArrayList<AutomaticDepositWithBankInfo> arrayList2 = new ArrayList();
        for (Object obj : automaticDeposits) {
            if (((AutomaticDepositWithBankInfo) obj).getAutomaticDeposit().getExtraCashDepositScheduleState() != ExtraCashDepositScheduleState.PAUSED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CALENDAR_24);
            String string2 = resources.getString(C30439R.string.scheduled);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (AutomaticDepositWithBankInfo automaticDepositWithBankInfo : arrayList2) {
                arrayList3.add(toRow(automaticDepositWithBankInfo, recurringDepositHubDataState.getBrokerageAccounts().get(automaticDepositWithBankInfo.getAutomaticDeposit().getDestinationAccount().getAccountId()), clock, resources));
            }
            arrayList.add(new RecurringDepositHubViewState.Section(size24, annotatedString, extensions2.toPersistentList(arrayList3)));
        }
        List<AutomaticDepositWithBankInfo> automaticDeposits2 = recurringDepositHubDataState.getAutomaticDeposits();
        ArrayList<AutomaticDepositWithBankInfo> arrayList4 = new ArrayList();
        for (Object obj2 : automaticDeposits2) {
            if (((AutomaticDepositWithBankInfo) obj2).getAutomaticDeposit().getExtraCashDepositScheduleState() == ExtraCashDepositScheduleState.PAUSED) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.PAUSE_INLINE_24);
            String string3 = resources.getString(C11048R.string.general_label_paused);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            AnnotatedString annotatedString2 = new AnnotatedString(string3, null, 2, null);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            for (AutomaticDepositWithBankInfo automaticDepositWithBankInfo2 : arrayList4) {
                arrayList5.add(toRow(automaticDepositWithBankInfo2, recurringDepositHubDataState.getBrokerageAccounts().get(automaticDepositWithBankInfo2.getAutomaticDeposit().getDestinationAccount().getAccountId()), clock, resources));
            }
            arrayList.add(new RecurringDepositHubViewState.Section(size242, annotatedString2, extensions2.toPersistentList(arrayList5)));
        }
        return extensions2.toPersistentList(arrayList);
    }

    public static final RecurringDepositHubViewState.Row toRow(AutomaticDepositWithBankInfo automaticDepositWithBankInfo, Account account, Clock clock, Resources resources) throws Resources.NotFoundException {
        String destinationAccountDisplayString;
        Intrinsics.checkNotNullParameter(automaticDepositWithBankInfo, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String id = automaticDepositWithBankInfo.getAutomaticDeposit().getId();
        String achRelationshipId = automaticDepositWithBankInfo.getAutomaticDeposit().getAchRelationshipId();
        DepositScheduleType depositScheduleType = automaticDepositWithBankInfo.getAutomaticDeposit().getDepositScheduleType();
        AnnotatedString annotatedString = new AnnotatedString(titlePrimaryText(automaticDepositWithBankInfo.getAutomaticDeposit(), resources), null, 2, null);
        String strTitleSecondaryText = titleSecondaryText(automaticDepositWithBankInfo.getAutomaticDeposit(), resources);
        AnnotatedString annotatedString2 = strTitleSecondaryText != null ? new AnnotatedString(strTitleSecondaryText, null, 2, null) : null;
        int i = C30439R.string.recurring_deposit_destination_subtitle;
        String nickname = account != null ? account.getNickname() : null;
        if (nickname == null || nickname.length() == 0) {
            destinationAccountDisplayString = UiAutomaticDeposits.getDestinationAccountDisplayString(automaticDepositWithBankInfo.getAutomaticDeposit().getDestinationAccount().getAccountType(), resources);
        } else {
            destinationAccountDisplayString = account.getNickname();
        }
        String string2 = resources.getString(i, destinationAccountDisplayString);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new RecurringDepositHubViewState.Row(id, achRelationshipId, depositScheduleType, annotatedString, annotatedString2, new AnnotatedString(string2, null, 2, null), secondSubtitle(automaticDepositWithBankInfo.getAutomaticDeposit(), clock, resources), automaticDepositWithBankInfo.getAutomaticDeposit().getExtraCashDepositScheduleState() == ExtraCashDepositScheduleState.EXPIRED);
    }

    public static final String titlePrimaryText(AutomaticDeposit automaticDeposit, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(automaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (automaticDeposit.getDepositScheduleType() == DepositScheduleType.EXTRA_CASH) {
            String string2 = resources.getString(C30439R.string.extra_cash);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        return Money.format$default(automaticDeposit.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public static final String titleSecondaryText(AutomaticDeposit automaticDeposit, Resources resources) {
        Intrinsics.checkNotNullParameter(automaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (automaticDeposit.getDepositScheduleType() == DepositScheduleType.EXTRA_CASH) {
            return null;
        }
        return AutomaticDepositFrequencies.getAutomaticDepositOption(automaticDeposit.getFrequency(), resources);
    }

    public static final AnnotatedString secondSubtitle(AutomaticDeposit automaticDeposit, Clock clock, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(automaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (automaticDeposit.getExtraCashDepositScheduleState() == ExtraCashDepositScheduleState.PAUSED) {
            return null;
        }
        if (automaticDeposit.getExtraCashDepositScheduleState() == ExtraCashDepositScheduleState.EXPIRED) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String string2 = resources.getString(C30439R.string.relink_account);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            builder.append(string2);
            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null), 0, builder.getLength());
            return builder.toAnnotatedString();
        }
        if (automaticDeposit.canBeSkipped(clock)) {
            String string3 = resources.getString(C30439R.string.next_deposit, LocalDateFormatter.MEDIUM_NO_YEAR.format(automaticDeposit.getNextDepositDate()));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new AnnotatedString(string3, null, 2, null);
        }
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        String string4 = resources.getString(C30439R.string.skipping_next_deposit);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        builder2.append(string4);
        builder2.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), 0, builder2.getLength());
        return builder2.toAnnotatedString();
    }
}
