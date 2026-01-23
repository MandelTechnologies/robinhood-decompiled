package com.robinhood.android.matcha.p177ui.search.contactlookup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.p2p.common.ProfileAvatarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConfirmUserComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt$lambda$719729513$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ConfirmUserComposable3 implements Function2<Composer, Integer, Unit> {
    public static final ConfirmUserComposable3 INSTANCE = new ConfirmUserComposable3();

    ConfirmUserComposable3() {
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
            ComposerKt.traceEventStart(719729513, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt.lambda$719729513.<anonymous> (ConfirmUserComposable.kt:137)");
        }
        ProfileAvatarState.Icon icon = ProfileAvatarState.Icon.PHONE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt$lambda$719729513$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt$lambda$719729513$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$ConfirmUserComposableKt$lambda$719729513$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ConfirmUserComposable4.ConfirmUser("Do you want to pay this person?", "It looks like the person you're trying to pay is already on Robinhood", icon, "John Doe", "jdoe", "Continue", function0, "Cancel", function02, true, (Function0) objRememberedValue3, composer, 920350134, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
