package com.robinhood.shared.iac.extensions;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.iac.extensions.IacInfoBannerComposable;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IacInfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"IacInfoBannerComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "callbacks", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/IacInfoBanner;Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;Landroidx/compose/runtime/Composer;II)V", "lib-iac-info-banner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.iac.extensions.IacInfoBannerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IacInfoBannerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IacInfoBannerComposable$lambda$0(Modifier modifier, IacInfoBanner iacInfoBanner, InfoBannerCallbacks infoBannerCallbacks, int i, int i2, Composer composer, int i3) {
        IacInfoBannerComposable(modifier, iacInfoBanner, infoBannerCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IacInfoBannerComposable(Modifier modifier, final IacInfoBanner banner, InfoBannerCallbacks infoBannerCallbacks, Composer composer, final int i, final int i2) {
        int i3;
        InfoBannerCallbacks infoBannerCallbacks2;
        final Modifier modifier2;
        Composer composer2;
        final InfoBannerCallbacks infoBannerCallbacks3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Composer composerStartRestartGroup = composer.startRestartGroup(1135969267);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(banner) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                infoBannerCallbacks2 = infoBannerCallbacks;
                i3 |= composerStartRestartGroup.changed(infoBannerCallbacks2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier2 = i4 == 0 ? Modifier.INSTANCE : modifier;
                InfoBannerCallbacks infoBannerCallbacks4 = i5 == 0 ? null : infoBannerCallbacks2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1135969267, i3, -1, "com.robinhood.shared.iac.extensions.IacInfoBannerComposable (IacInfoBannerComposable.kt:28)");
                }
                composer2 = composerStartRestartGroup;
                InfoBannerCallbacks infoBannerCallbacks5 = infoBannerCallbacks4;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1618778513, true, new C390411(modifier2, IacInfoBanners.generateEventDescriptor(banner, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), banner, infoBannerCallbacks5, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(banner.getStyle().getTextColor()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), composerStartRestartGroup, 0, 0), SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(banner.getStyle().getBackgroundColor()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, 0, 0)), composer2, 54), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                infoBannerCallbacks3 = infoBannerCallbacks5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
                infoBannerCallbacks3 = infoBannerCallbacks2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannerComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IacInfoBannerComposable.IacInfoBannerComposable$lambda$0(modifier2, banner, infoBannerCallbacks3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        infoBannerCallbacks2 = infoBannerCallbacks;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            InfoBannerCallbacks infoBannerCallbacks52 = infoBannerCallbacks4;
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1618778513, true, new C390411(modifier2, IacInfoBanners.generateEventDescriptor(banner, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), banner, infoBannerCallbacks52, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(banner.getStyle().getTextColor()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), composerStartRestartGroup, 0, 0), SduiColors2.m18896toComposeColorDefaultediJQMabo(SduiColors2.toSduiThemedColor(banner.getStyle().getBackgroundColor()), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, 0, 0)), composer2, 54), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            infoBannerCallbacks3 = infoBannerCallbacks52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IacInfoBannerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.iac.extensions.IacInfoBannerComposableKt$IacInfoBannerComposable$1 */
    static final class C390411 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ IacInfoBanner $banner;
        final /* synthetic */ InfoBannerCallbacks $callbacks;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ long $foregroundColor;
        final /* synthetic */ Modifier $modifier;

        C390411(Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, IacInfoBanner iacInfoBanner, InfoBannerCallbacks infoBannerCallbacks, EventLogger eventLogger, long j, long j2) {
            this.$modifier = modifier;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$banner = iacInfoBanner;
            this.$callbacks = infoBannerCallbacks;
            this.$eventLogger = eventLogger;
            this.$foregroundColor = j;
            this.$backgroundColor = j2;
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
                ComposerKt.traceEventStart(1618778513, i, -1, "com.robinhood.shared.iac.extensions.IacInfoBannerComposable.<anonymous> (IacInfoBannerComposable.kt:39)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(this.$modifier, this.$eventDescriptor, true, false, false, false, false, null, 108, null);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(this.$banner.getText(), 0L, composer, 0, 1);
            ServerToBentoAssetMapper2 icon = this.$banner.getIcon();
            Function0 function0 = null;
            BentoIcon4.Size24 size24 = icon != null ? new BentoIcon4.Size24(icon) : null;
            String ctaText = this.$banner.getCtaText();
            composer.startReplaceGroup(868015369);
            if (this.$banner.getCanDismiss()) {
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(this.$callbacks) | composer.changedInstance(this.$banner) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
                final InfoBannerCallbacks infoBannerCallbacks = this.$callbacks;
                final IacInfoBanner iacInfoBanner = this.$banner;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final EventLogger eventLogger = this.$eventLogger;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannerComposableKt$IacInfoBannerComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IacInfoBannerComposable.C390411.invoke$lambda$2$lambda$1(infoBannerCallbacks, iacInfoBanner, userInteractionEventDescriptor, eventLogger);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
            }
            Function0 function02 = function0;
            composer.endReplaceGroup();
            long j = this.$foregroundColor;
            long j2 = this.$backgroundColor;
            composer.startReplaceGroup(-1224400529);
            boolean zChanged2 = composer.changed(this.$callbacks) | composer.changedInstance(this.$banner) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor);
            final InfoBannerCallbacks infoBannerCallbacks2 = this.$callbacks;
            final IacInfoBanner iacInfoBanner2 = this.$banner;
            final EventLogger eventLogger2 = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannerComposableKt$IacInfoBannerComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacInfoBannerComposable.C390411.invoke$lambda$4$lambda$3(infoBannerCallbacks2, iacInfoBanner2, eventLogger2, userInteractionEventDescriptor2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15956toAnnotatedStringiJQMabo, ctaText, j, j2, modifierAutoLogEvents$default, size24, (Function0) objRememberedValue2, function02, composer, BentoIcon4.Size24.$stable << 15, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(InfoBannerCallbacks infoBannerCallbacks, IacInfoBanner iacInfoBanner, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            if (infoBannerCallbacks != null) {
                infoBannerCallbacks.onClickInfoBanner(iacInfoBanner);
            }
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.TAP), false, false, 6, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(InfoBannerCallbacks infoBannerCallbacks, IacInfoBanner iacInfoBanner, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
            if (infoBannerCallbacks != null) {
                infoBannerCallbacks.onDismissInfoBanner(iacInfoBanner);
            }
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            return Unit.INSTANCE;
        }
    }
}
