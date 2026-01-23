package com.robinhood.android.account.naming.list;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountNicknameListScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.naming.list.ComposableSingletons$AccountNicknameListScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNicknameListScreen2 {
    public static final AccountNicknameListScreen2 INSTANCE = new AccountNicknameListScreen2();

    /* renamed from: lambda$-1349461207, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8619lambda$1349461207 = ComposableLambda3.composableLambdaInstance(-1349461207, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.ComposableSingletons$AccountNicknameListScreenKt$lambda$-1349461207$1
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
                ComposerKt.traceEventStart(-1349461207, i, -1, "com.robinhood.android.account.naming.list.ComposableSingletons$AccountNicknameListScreenKt.lambda$-1349461207.<anonymous> (AccountNicknameListScreen.kt:33)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8116R.string.account_nickname_list_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1438441195, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8620lambda$1438441195 = ComposableLambda3.composableLambdaInstance(-1438441195, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.list.ComposableSingletons$AccountNicknameListScreenKt$lambda$-1438441195$1
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
                ComposerKt.traceEventStart(-1438441195, i, -1, "com.robinhood.android.account.naming.list.ComposableSingletons$AccountNicknameListScreenKt.lambda$-1438441195.<anonymous> (AccountNicknameListScreen.kt:47)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierNavigationBarsPadding, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8116R.string.account_nickname_list_info, composer, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1349461207$feature_account_naming_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10792getLambda$1349461207$feature_account_naming_externalDebug() {
        return f8619lambda$1349461207;
    }

    /* renamed from: getLambda$-1438441195$feature_account_naming_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10793getLambda$1438441195$feature_account_naming_externalDebug() {
        return f8620lambda$1438441195;
    }
}
