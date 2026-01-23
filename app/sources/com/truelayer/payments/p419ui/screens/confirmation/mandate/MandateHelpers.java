package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.MandateConstraints;
import com.truelayer.payments.core.domain.payments.PeriodicLimits;
import com.truelayer.payments.p419ui.C42830R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"buildMandateLimitsList", "", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "mandate", "Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "(Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/MandateConstraints;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.MandateHelpersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateHelpers {
    public static final List<String> buildMandateLimitsList(Currency currency, MandateConstraints mandate, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        composer.startReplaceableGroup(-1318870327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1318870327, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.buildMandateLimitsList (MandateHelpers.kt:20)");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_single_payment, new Object[]{currency.formatAmount(mandate.getMaximumIndividualAmount())}, composer, 64));
        PeriodicLimits periodicLimits = mandate.getPeriodicLimits();
        PeriodicLimits.Limit day = periodicLimits != null ? periodicLimits.getDay() : null;
        composer.startReplaceableGroup(36092318);
        if (day != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_day, new Object[]{currency.formatAmount(day.getMaximumAmount())}, composer, 64));
        }
        composer.endReplaceableGroup();
        PeriodicLimits periodicLimits2 = mandate.getPeriodicLimits();
        PeriodicLimits.Limit week = periodicLimits2 != null ? periodicLimits2.getWeek() : null;
        composer.startReplaceableGroup(36092545);
        if (week != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_week, new Object[]{currency.formatAmount(week.getMaximumAmount())}, composer, 64));
        }
        composer.endReplaceableGroup();
        PeriodicLimits periodicLimits3 = mandate.getPeriodicLimits();
        PeriodicLimits.Limit fortnight = periodicLimits3 != null ? periodicLimits3.getFortnight() : null;
        composer.startReplaceableGroup(36092778);
        if (fortnight != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_fotnight, new Object[]{currency.formatAmount(fortnight.getMaximumAmount())}, composer, 64));
        }
        composer.endReplaceableGroup();
        PeriodicLimits periodicLimits4 = mandate.getPeriodicLimits();
        PeriodicLimits.Limit month = periodicLimits4 != null ? periodicLimits4.getMonth() : null;
        composer.startReplaceableGroup(36093011);
        if (month != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_month, new Object[]{currency.formatAmount(month.getMaximumAmount())}, composer, 64));
        }
        composer.endReplaceableGroup();
        PeriodicLimits periodicLimits5 = mandate.getPeriodicLimits();
        PeriodicLimits.Limit halfYear = periodicLimits5 != null ? periodicLimits5.getHalfYear() : null;
        composer.startReplaceableGroup(36093244);
        if (halfYear != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_half_year, new Object[]{currency.formatAmount(halfYear.getMaximumAmount())}, composer, 64));
        }
        composer.endReplaceableGroup();
        PeriodicLimits periodicLimits6 = mandate.getPeriodicLimits();
        PeriodicLimits.Limit year = periodicLimits6 != null ? periodicLimits6.getYear() : null;
        if (year != null) {
            arrayList.add(StringResources_androidKt.stringResource(C42830R.string.mandate_limit_per_year, new Object[]{currency.formatAmount(year.getMaximumAmount())}, composer, 64));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return arrayList;
    }
}
