package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionOnboardingKnowledgeCheckNeededFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingKnowledgeCheckNeededFragment2 extends FunctionReferenceImpl implements Function0<OptionOnboardingContext> {
    OptionOnboardingKnowledgeCheckNeededFragment2(Object obj) {
        super(0, obj, OptionOnboardingScreens2.class, "getOptionOnboardingScreenContext", "getOptionOnboardingScreenContext()Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final OptionOnboardingContext invoke() {
        return ((OptionOnboardingScreens2) this.receiver).getOptionOnboardingScreenContext();
    }
}
