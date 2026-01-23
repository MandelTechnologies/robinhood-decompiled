package com.robinhood.android.acatsin.accountcontents;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsViewState;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInAccountContentsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt$lambda$-116282879$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAccountContentsFragment5 implements Function2<Composer, Integer, Unit> {
    public static final AcatsInAccountContentsFragment5 INSTANCE = new AcatsInAccountContentsFragment5();

    AcatsInAccountContentsFragment5() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-116282879, i, -1, "com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt.lambda$-116282879.<anonymous> (AcatsInAccountContentsFragment.kt:76)");
        }
        AcatsInAccountContentsViewState.Ready readyGenerate = AcatsInAccountContentsViewState_ReadyMock.INSTANCE.generate();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt$lambda$-116282879$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsInAccountContentsFragment5.invoke$lambda$1$lambda$0((AccountContentItem) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt$lambda$-116282879$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsInAccountContentsFragment5.invoke$lambda$3$lambda$2((AccountContentItem) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt$lambda$-116282879$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function0 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acatsin.accountcontents.ComposableSingletons$AcatsInAccountContentsFragmentKt$lambda$-116282879$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AcatsInAccountContentsComposable.AcatsInAccountContentsComposable(readyGenerate, function1, function12, function0, (Function0) objRememberedValue4, composer, 28080);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AccountContentItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(AccountContentItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
