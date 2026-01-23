package com.robinhood.android.investmentstracker.viewmodels;

import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;

/* compiled from: InvestmentsTrackerComponent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "id", "", "getId", "()Ljava/lang/String;", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InvestmentsTrackerComponent {
    InvestmentsTrackerComponent copyForView();

    String getId();

    SecurityFilter getSecurityFilter();

    InvestmentsTrackerComponentType getType();
}
