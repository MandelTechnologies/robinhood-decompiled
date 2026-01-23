package com.robinhood.android.investFlow.frequency;

import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowFrequencyComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyCallbacks;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "", "onDateClicked", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "frequency", "onFrequencyClicked", "(Lcom/robinhood/android/investFlow/frequency/Frequency;)V", "onDisclaimerClicked", "()V", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "onContinueClicked", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "onBackClicked", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface InvestFlowFrequencyComposable3 {
    void onBackClicked();

    void onContinueClicked(InvestFlowFrequency frequency);

    void onDateClicked(LocalDate date);

    void onDisclaimerClicked();

    void onFrequencyClicked(Frequency frequency);
}
