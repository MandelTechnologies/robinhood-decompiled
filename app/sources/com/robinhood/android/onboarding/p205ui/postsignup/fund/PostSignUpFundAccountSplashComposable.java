package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"PostSignUpFundAccountSplashComposable", "", "topHalfColor", "Landroidx/compose/ui/graphics/Color;", "content", "Lcom/robinhood/models/api/PostOnboardingFundAccountSplashScreenContent;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "modifier", "Landroidx/compose/ui/Modifier;", "onCtaClicked", "Lkotlin/Function0;", "PostSignUpFundAccountSplashComposable-ZPw9REg", "(JLcom/robinhood/models/api/PostOnboardingFundAccountSplashScreenContent;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SplashScreenHeaderImageTestTag", "", "SplashScreenHeaderAnimationTestTag", "feature-onboarding_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "state", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountSplashComposable {
    public static final String SplashScreenHeaderAnimationTestTag = "headerAnimation";
    public static final String SplashScreenHeaderImageTestTag = "headerImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostSignUpFundAccountSplashComposable_ZPw9REg$lambda$0(long j, PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, Screen screen, Context context, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        m16851PostSignUpFundAccountSplashComposableZPw9REg(j, postOnboardingFundAccountSplashScreenContent, screen, context, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: PostSignUpFundAccountSplashComposable-ZPw9REg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16851PostSignUpFundAccountSplashComposableZPw9REg(final long j, final PostOnboardingFundAccountSplashScreenContent content, final Screen eventScreen, final Context context, Modifier modifier, final Function0<Unit> onCtaClicked, Composer composer, final int i, final int i2) {
        int i3;
        Context context2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-40984086);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            context2 = context;
        } else {
            context2 = context;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40984086, i3, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposable (PostSignUpFundAccountSplashComposable.kt:58)");
                }
                Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, context2, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1600009579, true, new PostSignUpFundAccountSplashComposable2(modifier5, j, content, onCtaClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PostSignUpFundAccountSplashComposable.PostSignUpFundAccountSplashComposable_ZPw9REg$lambda$0(j, content, eventScreen, context, modifier3, onCtaClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, context2, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1600009579, true, new PostSignUpFundAccountSplashComposable2(modifier52, j, content, onCtaClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
