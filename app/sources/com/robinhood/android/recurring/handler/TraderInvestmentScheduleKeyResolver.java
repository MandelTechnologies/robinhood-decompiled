package com.robinhood.android.recurring.handler;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: TraderInvestmentScheduleKeyResolver.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJO\u0010\f\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/recurring/handler/TraderInvestmentScheduleKeyResolver;", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "<init>", "()V", "", "getRecurringSelectionKey", "()Ljava/lang/Void;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "currencyPair", "", "accountNumber", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "getRecurringCreationKey", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/NavigationKey;", "Ljava/util/UUID;", "instrumentId", "", "isFromHook", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "loggingEntryPoint", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "(Ljava/util/UUID;ZLcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Ljava/lang/String;)Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "lib-recurring-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TraderInvestmentScheduleKeyResolver implements InvestmentScheduleKeyResolver {
    public static final TraderInvestmentScheduleKeyResolver INSTANCE = new TraderInvestmentScheduleKeyResolver();

    private TraderInvestmentScheduleKeyResolver() {
    }

    @Override // com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver
    public /* bridge */ /* synthetic */ FragmentKey getRecurringSelectionKey() {
        return (FragmentKey) m17862getRecurringSelectionKey();
    }

    /* renamed from: getRecurringSelectionKey, reason: collision with other method in class */
    public Void m17862getRecurringSelectionKey() {
        throw new IllegalStateException("Unused");
    }

    @Override // com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver
    public NavigationKey getRecurringCreationKey(UiCurrencyPair currencyPair, String accountNumber) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        return new RecurringGenericCreationFragmentKey(new InvestmentTarget(currencyPair.getId(), currencyPair.getSymbol(), ApiAssetType.CRYPTO), RecurringContext.EntryPoint.CRYPTO_DETAIL_PAGE, false, null, null, null, null, false, null, false, accountNumber, false, false, false, null, false, false, 130040, null);
    }

    @Override // com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver
    public RecurringGenericCreationFragmentKey getRecurringCreationKey(UUID instrumentId, boolean isFromHook, RecurringContext.EntryPoint loggingEntryPoint, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(loggingEntryPoint, "loggingEntryPoint");
        return new RecurringGenericCreationFragmentKey(new InvestmentTarget(instrumentId, null, ApiAssetType.CRYPTO), loggingEntryPoint, isFromHook, frequency, startDate, amount, null, loggingEntryPoint != RecurringContext.EntryPoint.CRYPTO_ORDER_RECEIPT, null, false, accountNumber, false, false, false, null, false, false, 129856, null);
    }
}
