package com.robinhood.android.crypto.costbasis.details.entry;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$-200545027$1 */
/* loaded from: classes2.dex */
final class C12795x7695c331 implements Function2<Composer, Integer, Unit> {
    public static final C12795x7695c331 INSTANCE = new C12795x7695c331();

    C12795x7695c331() {
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
            ComposerKt.traceEventStart(-200545027, i, -1, "com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt.lambda$-200545027.<anonymous> (CryptoCostBasisEntryComposable.kt:409)");
        }
        CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = new CryptoCostBasisEntryViewState(false, StringResource.INSTANCE.invoke("1,234 of 5,678 DOGE remaining"), extensions2.persistentListOf(), true, false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$-200545027$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12795x7695c331.invoke$lambda$1$lambda$0((InputRow) obj, (KeyEvent) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$-200545027$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12795x7695c331.invoke$lambda$3$lambda$2((InputRow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.entry.ComposableSingletons$CryptoCostBasisEntryComposableKt$lambda$-200545027$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12795x7695c331.invoke$lambda$5$lambda$4((ImmutableList) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposableContent(cryptoCostBasisEntryViewState, function2, function1, (Function1) objRememberedValue3, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InputRow inputRow, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(inputRow, "<unused var>");
        Intrinsics.checkNotNullParameter(keyEvent, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(InputRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ImmutableList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
