package com.robinhood.shared.common.etpcomposition;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo2;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo5;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: EtpCompositionV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/res/Resources;Lj$/time/Clock;)V", "dataState", "reduce", "(Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;)Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "Landroid/content/res/Resources;", "Lj$/time/Clock;", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2StateProvider, reason: use source file name */
/* loaded from: classes26.dex */
public final class EtpCompositionV2Duxo4 implements StateProvider<EtpCompositionV2Duxo2, EtpCompositionV2Duxo5> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Resources resources;

    public EtpCompositionV2Duxo4(Resources resources, Clock clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.resources = resources;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EtpCompositionV2Duxo5 reduce(EtpCompositionV2Duxo2 dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof EtpCompositionV2Duxo2.Loading) {
            return EtpCompositionV2Duxo5.Loading.INSTANCE;
        }
        if (dataState instanceof EtpCompositionV2Duxo2.LoadedNoDetails) {
            return EtpCompositionV2Duxo5.LoadedNoDetails.INSTANCE;
        }
        if (!(dataState instanceof EtpCompositionV2Duxo2.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        EtpCompositionV2Duxo2.Loaded loaded = (EtpCompositionV2Duxo2.Loaded) dataState;
        LocalDate holdingsPortfolioDate = loaded.getEtpDetails().getHoldingsPortfolioDate();
        StringResource stringResourceInvoke = holdingsPortfolioDate != null ? StringResource.INSTANCE.invoke(C37462R.string.etp_composition_portfolio_date_text, LocalDates4.formatRecent$default(holdingsPortfolioDate, this.resources, LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR, null, false, false, false, false, false, this.clock, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)) : null;
        if (loaded.getInstrument().isRhvCef()) {
            return new EtpCompositionV2Duxo5.Loaded.RhvCef(stringResourceInvoke, loaded.getEtpDetails().getHoldings());
        }
        return new EtpCompositionV2Duxo5.Loaded.StandardEtp(stringResourceInvoke);
    }
}
