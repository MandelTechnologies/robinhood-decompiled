package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: RecurringDepositHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState;", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/res/Resources;", "resources", "<init>", "(Lj$/time/Clock;Landroid/content/res/Resources;)V", "dataState", "reduce", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;)Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState;", "Lj$/time/Clock;", "Landroid/content/res/Resources;", "j$/time/LocalDate", "kotlin.jvm.PlatformType", "now", "Lj$/time/LocalDate;", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositHubStateProvider implements StateProvider<RecurringDepositHubDataState, RecurringDepositHubViewState> {
    private final Clock clock;
    private final LocalDate now;
    private final Resources resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final LocalDate NewLabelExpirationDate = LocalDate.m3377of(2026, 3, 1);

    public RecurringDepositHubStateProvider(Clock clock, Resources resources) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.clock = clock;
        this.resources = resources;
        this.now = LocalDate.now(clock);
    }

    @Override // com.robinhood.android.udf.StateProvider
    public RecurringDepositHubViewState reduce(RecurringDepositHubDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        InfoBanner<GenericAction> infoBanner = RecurringDepositHubStateProvider2.infoBanner(dataState, this.resources);
        Resources resources = this.resources;
        LocalDate now = this.now;
        Intrinsics.checkNotNullExpressionValue(now, "now");
        LocalDate NewLabelExpirationDate2 = NewLabelExpirationDate;
        Intrinsics.checkNotNullExpressionValue(NewLabelExpirationDate2, "NewLabelExpirationDate");
        return new RecurringDepositHubViewState(infoBanner, RecurringDepositHubStateProvider2.labelPillForRecurringExtraCash(resources, now, NewLabelExpirationDate2), RecurringDepositHubStateProvider2.toSections(dataState, this.clock, this.resources));
    }

    /* compiled from: RecurringDepositHubStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider$Companion;", "", "<init>", "()V", "j$/time/LocalDate", "kotlin.jvm.PlatformType", "NewLabelExpirationDate", "Lj$/time/LocalDate;", "getNewLabelExpirationDate", "()Lj$/time/LocalDate;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LocalDate getNewLabelExpirationDate() {
            return RecurringDepositHubStateProvider.NewLabelExpirationDate;
        }
    }
}
