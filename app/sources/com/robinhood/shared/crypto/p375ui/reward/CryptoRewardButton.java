package com.robinhood.shared.crypto.p375ui.reward;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.shared.crypto.p375ui.reward.CryptoRewardButton;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: CryptoRewardButton.kt */
@Metadata(m3635d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\nX\u008a\u0084\u0002"}, m3636d2 = {"CryptoRewardButton", "", "buttonDto", "Lrh_server_driven_ui/v1/ButtonDto;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ButtonDto;Lcom/robinhood/compose/bento/theme/Direction;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "customButtonStyle", "com/robinhood/shared/crypto/ui/reward/CryptoRewardButtonKt$customButtonStyle$1", "original", "Lcom/robinhood/compose/theme/Styles;", "(Lcom/robinhood/compose/theme/Styles;)Lcom/robinhood/shared/crypto/ui/reward/CryptoRewardButtonKt$customButtonStyle$1;", "lib-crypto-ui_externalDebug", "customStyle"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoRewardButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoRewardButton$lambda$0(ButtonDto buttonDto, BentoTheme4 bentoTheme4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoRewardButton(buttonDto, bentoTheme4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ C386071 access$customButtonStyle(Styles styles) {
        return customButtonStyle(styles);
    }

    public static final void CryptoRewardButton(final ButtonDto buttonDto, final BentoTheme4 direction, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(buttonDto, "buttonDto");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-96981119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(buttonDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(direction.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-96981119, i3, -1, "com.robinhood.shared.crypto.ui.reward.CryptoRewardButton (CryptoRewardButton.kt:57)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(-250574181, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt.CryptoRewardButton.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-250574181, i5, -1, "com.robinhood.shared.crypto.ui.reward.CryptoRewardButton.<anonymous> (CryptoRewardButton.kt:61)");
                    }
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                    final Navigator navigator2 = navigator;
                    final Context context2 = context;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$CryptoRewardButton$1$1$1
                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(GenericAction action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                DeepLinkAction deeplink = action.getDeeplink();
                                if (deeplink != null) {
                                    return Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(deeplink.getUrl()), null, null, false, null, 60, null);
                                }
                                return false;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(2119211994, true, new AnonymousClass2(buttonDto, modifier), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoRewardButton.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$CryptoRewardButton$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ButtonDto $buttonDto;
                    final /* synthetic */ Modifier $modifier;

                    AnonymousClass2(ButtonDto buttonDto, Modifier modifier) {
                        this.$buttonDto = buttonDto;
                        this.$modifier = modifier;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: CryptoRewardButton.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$CryptoRewardButton$1$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ ButtonDto $buttonDto;
                        final /* synthetic */ Modifier $modifier;

                        AnonymousClass1(ButtonDto buttonDto, Modifier modifier) {
                            this.$buttonDto = buttonDto;
                            this.$modifier = modifier;
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
                                ComposerKt.traceEventStart(-1510424806, i, -1, "com.robinhood.shared.crypto.ui.reward.CryptoRewardButton.<anonymous>.<anonymous>.<anonymous> (CryptoRewardButton.kt:71)");
                            }
                            ButtonDto buttonDto = this.$buttonDto;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$CryptoRewardButton$1$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoRewardButton.C386061.AnonymousClass2.AnonymousClass1.invoke$lambda$1$lambda$0((ActionDto) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            SduiButton2.SduiButton(buttonDto, (Function1) objRememberedValue, this.$modifier, composer, 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final GenericAction invoke$lambda$1$lambda$0(ActionDto actionDto) {
                            Intrinsics.checkNotNullParameter(actionDto, "actionDto");
                            AnyMessage concrete = actionDto.getConcrete();
                            if (concrete != null) {
                                return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
                            }
                            return null;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2119211994, i, -1, "com.robinhood.shared.crypto.ui.reward.CryptoRewardButton.<anonymous>.<anonymous> (CryptoRewardButton.kt:68)");
                        }
                        final Styles styles = (Styles) composer.consume(Styles2.getLocalStyles());
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$CryptoRewardButton$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoRewardButton.access$customButtonStyle(styles);
                                }
                            });
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(invoke$lambda$2((SnapshotState4) objRememberedValue)), ComposableLambda3.rememberComposableLambda(-1510424806, true, new AnonymousClass1(this.$buttonDto, this.$modifier), composer, 54), composer, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    private static final C386071 invoke$lambda$2(SnapshotState4<C386071> snapshotState4) {
                        return snapshotState4.getValue();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoRewardButton.CryptoRewardButton$lambda$0(buttonDto, direction, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt$customButtonStyle$1] */
    public static final C386071 customButtonStyle(final Styles styles) {
        return new Styles() { // from class: com.robinhood.shared.crypto.ui.reward.CryptoRewardButtonKt.customButtonStyle.1
            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public AppBarStyle getAppBar(Composer composer, int i) {
                composer.startReplaceGroup(1836691740);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1836691740, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-appBar> (CryptoRewardButton.kt:84)");
                }
                AppBarStyle appBar = styles.getAppBar(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return appBar;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ButtonStyle getButton(Composer composer, int i) {
                composer.startReplaceGroup(-1681822180);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1681822180, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-button> (CryptoRewardButton.kt:88)");
                }
                float f = 32;
                float f2 = 16;
                float f3 = 6;
                ButtonStyle buttonStyleCopy = styles.getButton(composer, 0).copy(ButtonStyle.Style.m21714copyd8LSEHM$default(styles.getButton(composer, 0).getPrimary(), null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f3)), C2002Dp.m7995constructorimpl(f), null, 9, null), ButtonStyle.Style.m21714copyd8LSEHM$default(styles.getButton(composer, 0).getSecondary(), null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f3)), C2002Dp.m7995constructorimpl(f), null, 9, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonStyleCopy;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ButtonBarStyle getButtonBar(Composer composer, int i) {
                composer.startReplaceGroup(-778071043);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-778071043, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-buttonBar> (CryptoRewardButton.kt:107)");
                }
                ButtonBarStyle buttonBar = styles.getButtonBar(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonBar;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ChartStyle getChart(Composer composer, int i) {
                composer.startReplaceGroup(2058053280);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2058053280, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-chart> (CryptoRewardButton.kt:111)");
                }
                ChartStyle chart = styles.getChart(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return chart;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public CheckboxStyle getCheckBox(Composer composer, int i) {
                composer.startReplaceGroup(226216781);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226216781, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-checkBox> (CryptoRewardButton.kt:115)");
                }
                CheckboxStyle checkBox = styles.getCheckBox(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return checkBox;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer, int i) {
                composer.startReplaceGroup(-76451333);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-76451333, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-circularProgressIndicator> (CryptoRewardButton.kt:119)");
                }
                CircularProgressIndicatorStyle circularProgressIndicator = styles.getCircularProgressIndicator(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return circularProgressIndicator;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public CommunicationCardStyle getCommunicationCard(Composer composer, int i) {
                composer.startReplaceGroup(1488354424);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1488354424, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-communicationCard> (CryptoRewardButton.kt:123)");
                }
                CommunicationCardStyle communicationCard = styles.getCommunicationCard(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return communicationCard;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer, int i) {
                composer.startReplaceGroup(555567814);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(555567814, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-expandableButtonTray> (CryptoRewardButton.kt:127)");
                }
                ExpandableButtonTrayStyle expandableButtonTray = styles.getExpandableButtonTray(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return expandableButtonTray;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public IconButtonStyle getIconButton(Composer composer, int i) {
                composer.startReplaceGroup(-1293889835);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1293889835, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-iconButton> (CryptoRewardButton.kt:131)");
                }
                IconButtonStyle iconButton = styles.getIconButton(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return iconButton;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public InfoBannerStyle getInfoBanner(Composer composer, int i) {
                composer.startReplaceGroup(-1373021852);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1373021852, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-infoBanner> (CryptoRewardButton.kt:135)");
                }
                InfoBannerStyle infoBanner = styles.getInfoBanner(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return infoBanner;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer, int i) {
                composer.startReplaceGroup(-2042491811);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2042491811, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-markdownSpannedText> (CryptoRewardButton.kt:139)");
                }
                MarkdownSpannedTextStyle markdownSpannedText = styles.getMarkdownSpannedText(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return markdownSpannedText;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public NumpadStyle getNumpad(Composer composer, int i) {
                composer.startReplaceGroup(2026385751);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2026385751, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-numpad> (CryptoRewardButton.kt:143)");
                }
                NumpadStyle numpad = styles.getNumpad(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return numpad;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public PlaceholderStyle getPlaceholder(Composer composer, int i) {
                composer.startReplaceGroup(-836839733);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-836839733, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-placeholder> (CryptoRewardButton.kt:147)");
                }
                PlaceholderStyle placeholder = styles.getPlaceholder(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return placeholder;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public PogStyle getPog(Composer composer, int i) {
                composer.startReplaceGroup(38853814);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(38853814, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-pog> (CryptoRewardButton.kt:151)");
                }
                PogStyle pog = styles.getPog(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pog;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public RadioButtonStyle getRadioButton(Composer composer, int i) {
                composer.startReplaceGroup(498907825);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(498907825, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-radioButton> (CryptoRewardButton.kt:155)");
                }
                RadioButtonStyle radioButton = styles.getRadioButton(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return radioButton;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public RowStyle getRow(Composer composer, int i) {
                composer.startReplaceGroup(-1284010332);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1284010332, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-row> (CryptoRewardButton.kt:159)");
                }
                RowStyle row = styles.getRow(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return row;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public SpanButtonStyle getSpanButton(Composer composer, int i) {
                composer.startReplaceGroup(941740742);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(941740742, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-spanButton> (CryptoRewardButton.kt:163)");
                }
                SpanButtonStyle spanButton = styles.getSpanButton(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return spanButton;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public TextStyle getText(Composer composer, int i) {
                composer.startReplaceGroup(-2085350025);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2085350025, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-text> (CryptoRewardButton.kt:167)");
                }
                TextStyle text = styles.getText(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return text;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public TextButtonStyle getTextButton(Composer composer, int i) {
                composer.startReplaceGroup(-43959799);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-43959799, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-textButton> (CryptoRewardButton.kt:171)");
                }
                TextButtonStyle textButton = styles.getTextButton(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return textButton;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public TextInputStyle getTextInput(Composer composer, int i) {
                composer.startReplaceGroup(121118945);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(121118945, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-textInput> (CryptoRewardButton.kt:175)");
                }
                TextInputStyle textInput = styles.getTextInput(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return textInput;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ToggleRowStyle getToggleRow(Composer composer, int i) {
                composer.startReplaceGroup(-226654568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-226654568, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-toggleRow> (CryptoRewardButton.kt:179)");
                }
                ToggleRowStyle toggleRow = styles.getToggleRow(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return toggleRow;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public ProgressBarStyle getProgressBarStyle(Composer composer, int i) {
                composer.startReplaceGroup(350342454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(350342454, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-progressBarStyle> (CryptoRewardButton.kt:183)");
                }
                ProgressBarStyle progressBarStyle = styles.getProgressBarStyle(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return progressBarStyle;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public NavigationBarStyle getNavigationBarStyle(Composer composer, int i) {
                composer.startReplaceGroup(-131197827);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-131197827, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-navigationBarStyle> (CryptoRewardButton.kt:187)");
                }
                NavigationBarStyle navigationBarStyle = styles.getNavigationBarStyle(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return navigationBarStyle;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public CardStackStyle getCardStackStyle(Composer composer, int i) {
                composer.startReplaceGroup(1450269316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1450269316, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-cardStackStyle> (CryptoRewardButton.kt:191)");
                }
                CardStackStyle cardStackStyle = styles.getCardStackStyle(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return cardStackStyle;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public BentoSelectionRowStyle getSelectionRowStyle(Composer composer, int i) {
                composer.startReplaceGroup(-825589750);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-825589750, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-selectionRowStyle> (CryptoRewardButton.kt:195)");
                }
                BentoSelectionRowStyle selectionRowStyle = styles.getSelectionRowStyle(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return selectionRowStyle;
            }

            @Override // com.robinhood.compose.theme.Styles
            @JvmName
            public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer, int i) {
                composer.startReplaceGroup(-1902003433);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1902003433, i, -1, "com.robinhood.shared.crypto.ui.reward.customButtonStyle.<no name provided>.<get-loadingPlaceholderStyle> (CryptoRewardButton.kt:199)");
                }
                LoadingPlaceholderStyle loadingPlaceholderStyle = styles.getLoadingPlaceholderStyle(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return loadingPlaceholderStyle;
            }
        };
    }
}
