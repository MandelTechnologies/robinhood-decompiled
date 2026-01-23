package com.robinhood.android.prompts;

import com.robinhood.android.prompts.PromptsHandlingFragment;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsHandlingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.prompts.PromptsHandlingFragment$ComposeContent$1$1$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PromptsHandlingFragment3 extends FunctionReferenceImpl implements Function1<PromptsHandlingInfo, Unit> {
    PromptsHandlingFragment3(Object obj) {
        super(1, obj, PromptsHandlingFragment.Callbacks.class, "showNextChallenge", "showNextChallenge(Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PromptsHandlingInfo promptsHandlingInfo) {
        invoke2(promptsHandlingInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PromptsHandlingInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PromptsHandlingFragment.Callbacks) this.receiver).showNextChallenge(p0);
    }
}
