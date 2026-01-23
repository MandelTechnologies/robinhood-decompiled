package com.robinhood.android.matcha.p177ui.search.contactlookup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupViewState;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectFromMultipleUsersComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt$lambda$1999103689$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SelectFromMultipleUsersComposable3 implements Function2<Composer, Integer, Unit> {
    public static final SelectFromMultipleUsersComposable3 INSTANCE = new SelectFromMultipleUsersComposable3();

    SelectFromMultipleUsersComposable3() {
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
            ComposerKt.traceEventStart(1999103689, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt.lambda$1999103689.<anonymous> (SelectFromMultipleUsersComposable.kt:93)");
        }
        ProfileAvatarState.Icon icon = ProfileAvatarState.Icon.PHONE;
        List listListOf = CollectionsKt.listOf((Object[]) new ContactLookupViewState.SelectFromMultipleUsers.SelectionRow[]{new ContactLookupViewState.SelectFromMultipleUsers.SelectionRow(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Alice Snow", "asnow", icon, true), new ContactLookupViewState.SelectFromMultipleUsers.SelectionRow(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "John Doe", "jdoe", icon, false)});
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt$lambda$1999103689$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelectFromMultipleUsersComposable3.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt$lambda$1999103689$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ComposableSingletons$SelectFromMultipleUsersComposableKt$lambda$1999103689$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        SelectFromMultipleUsersComposable4.SelectFromMultipleUsers("Multiple users found", "Select a user from the list below", listListOf, function1, "Continue", "Cancel", function0, (Function0) objRememberedValue3, composer, 14380086);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
