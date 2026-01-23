package com.robinhood.android.accountcenter.views;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountCenterBannerView.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AccountCenterInfoBanner", "", "state", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$InfoBannerItem;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$InfoBannerItem;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-account-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBannerViewKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountCenterBannerView2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountCenterInfoBanner$lambda$2(UiTypedAccountCenterItem.InfoBannerItem infoBannerItem, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountCenterInfoBanner(infoBannerItem, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountCenterInfoBanner(final UiTypedAccountCenterItem.InfoBannerItem state, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        final Modifier modifier3;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2144026039);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerViewKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function03 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2144026039, i3, -1, "com.robinhood.android.accountcenter.views.AccountCenterInfoBanner (AccountCenterBannerView.kt:63)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.INFO_BANNER, state.getId(), 0 == true ? 1 : 0, 4, null), null, 41, null), ComposableLambda3.rememberComposableLambda(-1821847746, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerViewKt.AccountCenterInfoBanner.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1821847746, i6, -1, "com.robinhood.android.accountcenter.views.AccountCenterInfoBanner.<anonymous> (AccountCenterBannerView.kt:74)");
                            }
                            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(state.getText(), 0L, composer2, 0, 1);
                            BentoInfoBanner bentoInfoBanner = BentoInfoBanner.INSTANCE;
                            int i7 = BentoInfoBanner.$stable;
                            long jM21797getDefaultForeground0d7_KjU = bentoInfoBanner.getStyle(composer2, i7).getColors().m21797getDefaultForeground0d7_KjU();
                            long jM21796getDefaultBackground0d7_KjU = bentoInfoBanner.getStyle(composer2, i7).getColors().m21796getDefaultBackground0d7_KjU();
                            ServerToBentoAssetMapper2 icon = state.getIcon();
                            BentoIcon4.Size24 size24 = icon != null ? new BentoIcon4.Size24(icon) : null;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, null, false, false, false, true, false, null, 111, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15956toAnnotatedStringiJQMabo, null, jM21797getDefaultForeground0d7_KjU, jM21796getDefaultBackground0d7_KjU, PaddingKt.m5145paddingqDBjuR0(modifierAutoLogEvents$default, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0)), size24, function03, null, composer2, (BentoIcon4.Size24.$stable << 15) | 48, 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountCenterBannerView2.AccountCenterInfoBanner$lambda$2(state, modifier4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.INFO_BANNER, state.getId(), 0 == true ? 1 : 0, 4, null), null, 41, null), ComposableLambda3.rememberComposableLambda(-1821847746, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBannerViewKt.AccountCenterInfoBanner.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1821847746, i6, -1, "com.robinhood.android.accountcenter.views.AccountCenterInfoBanner.<anonymous> (AccountCenterBannerView.kt:74)");
                        }
                        AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(state.getText(), 0L, composer2, 0, 1);
                        BentoInfoBanner bentoInfoBanner = BentoInfoBanner.INSTANCE;
                        int i7 = BentoInfoBanner.$stable;
                        long jM21797getDefaultForeground0d7_KjU = bentoInfoBanner.getStyle(composer2, i7).getColors().m21797getDefaultForeground0d7_KjU();
                        long jM21796getDefaultBackground0d7_KjU = bentoInfoBanner.getStyle(composer2, i7).getColors().m21796getDefaultBackground0d7_KjU();
                        ServerToBentoAssetMapper2 icon = state.getIcon();
                        BentoIcon4.Size24 size24 = icon != null ? new BentoIcon4.Size24(icon) : null;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, null, false, false, false, true, false, null, 111, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15956toAnnotatedStringiJQMabo, null, jM21797getDefaultForeground0d7_KjU, jM21796getDefaultBackground0d7_KjU, PaddingKt.m5145paddingqDBjuR0(modifierAutoLogEvents$default, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0)), size24, function03, null, composer2, (BentoIcon4.Size24.$stable << 15) | 48, 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
