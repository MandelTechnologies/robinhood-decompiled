package com.robinhood.shared.portfolio.lists.p391ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UserListRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.ComposableSingletons$UserListRowComposableKt$lambda$443732163$1, reason: use source file name */
/* loaded from: classes6.dex */
final class UserListRowComposable3 implements Function2<Composer, Integer, Unit> {
    public static final UserListRowComposable3 INSTANCE = new UserListRowComposable3();

    UserListRowComposable3() {
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
            ComposerKt.traceEventStart(443732163, i, -1, "com.robinhood.shared.portfolio.lists.ui.ComposableSingletons$UserListRowComposableKt.lambda$443732163.<anonymous> (UserListRowComposable.kt:383)");
        }
        UserListRowComposable7.ScreenerRow screenerRow = new UserListRowComposable7.ScreenerRow(new Screener("123", "52 high-fives", "", "📈", null, "", "", CollectionsKt.emptyList(), false, 0, null, CollectionsKt.emptyList(), false), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.ComposableSingletons$UserListRowComposableKt$lambda$443732163$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        UserListRowComposable5.UserListRowComposable(screenerRow, (Function0) objRememberedValue, null, false, null, composer, 48, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
