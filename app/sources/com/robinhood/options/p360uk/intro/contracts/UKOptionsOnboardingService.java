package com.robinhood.options.p360uk.intro.contracts;

import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: UKOptionsOnboardingService.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService;", "", "getUKOptionsOnboardingContent", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.options.uk.intro")
/* loaded from: classes22.dex */
public interface UKOptionsOnboardingService {
    Object getUKOptionsOnboardingContent(Continuation<? super UkOptionsOnboardingContent> continuation);
}
