package com.robinhood.shared.stepupverification.challenge.email;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailChallengeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$3$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EmailChallengeComposable2 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    EmailChallengeComposable2(Object obj) {
        super(1, obj, EmailChallengeDuxo.class, "handleKeyPress", "handleKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EmailChallengeDuxo) this.receiver).handleKeyPress(p0);
    }
}
