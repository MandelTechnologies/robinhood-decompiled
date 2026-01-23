package com.robinhood.shared.recurring.resolver;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import java.util.UUID;
import kotlin.Metadata;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleKeyResolver.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJO\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getRecurringSelectionKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "currencyPair", "", "accountNumber", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "getRecurringCreationKey", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/NavigationKey;", "Ljava/util/UUID;", "instrumentId", "", "isFromHook", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "loggingEntryPoint", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/util/Money;", "amount", "(Ljava/util/UUID;ZLcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/NavigationKey;", "lib-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface InvestmentScheduleKeyResolver {
    NavigationKey getRecurringCreationKey(UiCurrencyPair currencyPair, String accountNumber);

    NavigationKey getRecurringCreationKey(UUID instrumentId, boolean isFromHook, RecurringContext.EntryPoint loggingEntryPoint, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount, String accountNumber);

    FragmentKey getRecurringSelectionKey();
}
