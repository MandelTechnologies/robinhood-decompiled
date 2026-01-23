package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CtaDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesDetailsPageFooterResponseDto;

/* compiled from: McwDataModels.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "", "primaryCta", "Lcom/robinhood/android/lib/store/mcw/data/Cta;", "secondaryCta", "<init>", "(Lcom/robinhood/android/lib/store/mcw/data/Cta;Lcom/robinhood/android/lib/store/mcw/data/Cta;)V", "getPrimaryCta", "()Lcom/robinhood/android/lib/store/mcw/data/Cta;", "getSecondaryCta", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CashBalancesDetailsPageData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Cta primaryCta;
    private final Cta secondaryCta;

    public static /* synthetic */ CashBalancesDetailsPageData copy$default(CashBalancesDetailsPageData cashBalancesDetailsPageData, Cta cta, Cta cta2, int i, Object obj) {
        if ((i & 1) != 0) {
            cta = cashBalancesDetailsPageData.primaryCta;
        }
        if ((i & 2) != 0) {
            cta2 = cashBalancesDetailsPageData.secondaryCta;
        }
        return cashBalancesDetailsPageData.copy(cta, cta2);
    }

    /* renamed from: component1, reason: from getter */
    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component2, reason: from getter */
    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final CashBalancesDetailsPageData copy(Cta primaryCta, Cta secondaryCta) {
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        return new CashBalancesDetailsPageData(primaryCta, secondaryCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashBalancesDetailsPageData)) {
            return false;
        }
        CashBalancesDetailsPageData cashBalancesDetailsPageData = (CashBalancesDetailsPageData) other;
        return Intrinsics.areEqual(this.primaryCta, cashBalancesDetailsPageData.primaryCta) && Intrinsics.areEqual(this.secondaryCta, cashBalancesDetailsPageData.secondaryCta);
    }

    public int hashCode() {
        return (this.primaryCta.hashCode() * 31) + this.secondaryCta.hashCode();
    }

    public String toString() {
        return "CashBalancesDetailsPageData(primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ")";
    }

    public CashBalancesDetailsPageData(Cta primaryCta, Cta secondaryCta) {
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
    }

    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    /* compiled from: McwDataModels.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData$Companion;", "", "<init>", "()V", "toCashBalancesDetailsPageData", "Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponseDto;", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CashBalancesDetailsPageData toCashBalancesDetailsPageData(GetCashBalancesDetailsPageFooterResponseDto getCashBalancesDetailsPageFooterResponseDto) {
            String title;
            String deeplink;
            String logging_identifier;
            UserInteractionEventData.Action actionFromValue;
            String title2;
            String deeplink2;
            UserInteractionEventData.Action actionFromValue2;
            String logging_identifier2;
            Intrinsics.checkNotNullParameter(getCashBalancesDetailsPageFooterResponseDto, "<this>");
            CtaDto primary_cta = getCashBalancesDetailsPageFooterResponseDto.getPrimary_cta();
            String str = "";
            if (primary_cta == null || (title = primary_cta.getTitle()) == null) {
                title = "";
            }
            CtaDto primary_cta2 = getCashBalancesDetailsPageFooterResponseDto.getPrimary_cta();
            if (primary_cta2 == null || (deeplink = primary_cta2.getDeeplink()) == null) {
                deeplink = "";
            }
            CtaDto primary_cta3 = getCashBalancesDetailsPageFooterResponseDto.getPrimary_cta();
            if (primary_cta3 == null || (logging_identifier = primary_cta3.getLogging_identifier()) == null) {
                logging_identifier = "";
            }
            CtaDto primary_cta4 = getCashBalancesDetailsPageFooterResponseDto.getPrimary_cta();
            if (primary_cta4 != null) {
                actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(primary_cta4.getLogging_action_identifier());
                if (actionFromValue == null) {
                    actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                }
            }
            Cta cta = new Cta(title, deeplink, logging_identifier, actionFromValue);
            CtaDto secondary_cta = getCashBalancesDetailsPageFooterResponseDto.getSecondary_cta();
            if (secondary_cta == null || (title2 = secondary_cta.getTitle()) == null) {
                title2 = "";
            }
            CtaDto secondary_cta2 = getCashBalancesDetailsPageFooterResponseDto.getSecondary_cta();
            if (secondary_cta2 == null || (deeplink2 = secondary_cta2.getDeeplink()) == null) {
                deeplink2 = "";
            }
            CtaDto secondary_cta3 = getCashBalancesDetailsPageFooterResponseDto.getSecondary_cta();
            if (secondary_cta3 != null && (logging_identifier2 = secondary_cta3.getLogging_identifier()) != null) {
                str = logging_identifier2;
            }
            CtaDto secondary_cta4 = getCashBalancesDetailsPageFooterResponseDto.getSecondary_cta();
            if (secondary_cta4 != null) {
                actionFromValue2 = UserInteractionEventData.Action.INSTANCE.fromValue(secondary_cta4.getLogging_action_identifier());
                if (actionFromValue2 == null) {
                    actionFromValue2 = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                }
            }
            return new CashBalancesDetailsPageData(cta, new Cta(title2, deeplink2, str, actionFromValue2));
        }
    }
}
