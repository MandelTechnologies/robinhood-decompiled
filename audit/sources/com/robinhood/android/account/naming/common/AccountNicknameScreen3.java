package com.robinhood.android.account.naming.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountNicknameScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNicknameScreen3 {
    public static final AccountNicknameScreen3 INSTANCE = new AccountNicknameScreen3();

    /* renamed from: lambda$-1951137022, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8617lambda$1951137022 = ComposableLambda3.composableLambdaInstance(-1951137022, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$-1951137022$1
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
                ComposerKt.traceEventStart(-1951137022, i, -1, "com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt.lambda$-1951137022.<anonymous> (AccountNicknameScreen.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2041802559 = ComposableLambda3.composableLambdaInstance(2041802559, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt$lambda$2041802559$1
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
                ComposerKt.traceEventStart(2041802559, i, -1, "com.robinhood.android.account.naming.common.ComposableSingletons$AccountNicknameScreenKt.lambda$2041802559.<anonymous> (AccountNicknameScreen.kt:89)");
            }
            int i2 = C8116R.string.app_use_standards_desc;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i2, bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composer, 0, 12), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.LINK_BUTTON, "app-use-standards", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2026457222, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8618lambda$2026457222 = ComposableLambda3.composableLambdaInstance(-2026457222, false, AccountNicknameScreen5.INSTANCE);

    /* renamed from: getLambda$-1951137022$feature_account_naming_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10786getLambda$1951137022$feature_account_naming_externalDebug() {
        return f8617lambda$1951137022;
    }

    /* renamed from: getLambda$-2026457222$feature_account_naming_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10787getLambda$2026457222$feature_account_naming_externalDebug() {
        return f8618lambda$2026457222;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2041802559$feature_account_naming_externalDebug() {
        return lambda$2041802559;
    }
}
