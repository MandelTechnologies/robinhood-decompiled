package com.robinhood.android.optionsupgrade;

import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates2;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOnboardingDisclosureStates.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"canLoadAgain", "", "T", "Lcom/robinhood/android/optionsupgrade/LoadingState;", "toLoadingState", "Lkotlin/Result;", "(Ljava/lang/Object;)Lcom/robinhood/android/optionsupgrade/LoadingState;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStatesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingDisclosureStates5 {
    public static final <T> boolean canLoadAgain(OptionOnboardingDisclosureStates2<T> optionOnboardingDisclosureStates2) {
        return (optionOnboardingDisclosureStates2 instanceof OptionOnboardingDisclosureStates2.Failure) || optionOnboardingDisclosureStates2 == null;
    }

    public static final <T> OptionOnboardingDisclosureStates2<T> toLoadingState(Object obj) {
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl != null) {
            return new OptionOnboardingDisclosureStates2.Failure(thM28553exceptionOrNullimpl);
        }
        return new OptionOnboardingDisclosureStates2.Success(obj);
    }
}
