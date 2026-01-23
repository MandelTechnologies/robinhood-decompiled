package com.robinhood.android.goldearningspotential.microgram;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorDisclosureViewModel;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorViewModel;
import kotlin.Metadata;
import microgram.p507ui.sdui.SduiText;

/* compiled from: GoldEarningsPotentialMicrogramSduiConverters.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;", "", "convertText", "Lcom/robinhood/models/serverdriven/experimental/api/Text;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "sduiText", "Lmicrogram/ui/sdui/SduiText;", "convertGoldEarningsPotentialCalculator", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;", "calculator", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", "convertGoldEarningsPotentialDisclosure", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "disclosureViewModel", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialSduiConverters, reason: use source file name */
/* loaded from: classes10.dex */
public interface GoldEarningsPotentialMicrogramSduiConverters {
    GoldEarningsCalculatorUiModel convertGoldEarningsPotentialCalculator(GoldEarningsCalculatorViewModel calculator);

    GoldEarningsDisclosureUiModel convertGoldEarningsPotentialDisclosure(GoldEarningsCalculatorDisclosureViewModel disclosureViewModel);

    Text<GenericAction> convertText(SduiText sduiText);
}
