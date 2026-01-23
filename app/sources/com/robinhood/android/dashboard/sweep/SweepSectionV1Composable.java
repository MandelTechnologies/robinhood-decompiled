package com.robinhood.android.dashboard.sweep;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.dashboard.sweep.SweepSectionDialogData;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
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
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SweepSectionV1Composable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001a\u001a=\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001e\"\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011\"\u0010\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"SweepSectionV1Composable", "", "section", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSection;", "onOpenDialog", "Lkotlin/Function1;", "Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData;", "onDeeplinkClicked", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSection;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BannerMinVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BannerItemsPadding", "GoldUpsellBanner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionUpsellBanner;", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionUpsellBanner;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepSectionDataRow", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$DataRow;", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$DataRow;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepSectionV1Header", "header", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionHeader;", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$SweepSectionHeader;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-dashboard-sweep_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SweepSectionV1Composable {
    private static final float BannerItemsPadding;
    private static final float BannerMinVerticalPadding;

    /* compiled from: SweepSectionV1Composable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSweepSplash.InfoTagStyle.values().length];
            try {
                iArr[ApiSweepSplash.InfoTagStyle.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSweepSplash.InfoTagStyle.GOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpsellBanner$lambda$13(ApiSweepSplash.SweepSectionUpsellBanner sweepSectionUpsellBanner, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldUpsellBanner(sweepSectionUpsellBanner, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionDataRow$lambda$18(ApiSweepSplash.DataRow dataRow, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionDataRow(dataRow, str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionV1Composable$lambda$10(ApiSweepSplash.SweepSection sweepSection, Function1 function1, SduiActionHandler sduiActionHandler, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionV1Composable(sweepSection, function1, sduiActionHandler, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionV1Header$lambda$23(ApiSweepSplash.SweepSectionHeader sweepSectionHeader, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionV1Header(sweepSectionHeader, str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9 A[LOOP:0: B:87:0x01f3->B:89:0x01f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SweepSectionV1Composable(final ApiSweepSplash.SweepSection section, final Function1<? super SweepSectionDialogData, Unit> onOpenDialog, final SduiActionHandler<? super DeeplinkAction> onDeeplinkClicked, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ApiSweepSplash.SweepSectionUpsellBanner upsell_banner_v2;
        ?? r9;
        Iterator<T> it;
        ApiSweepSplash.SweepSectionDepositRow depositRow;
        boolean z;
        Unit unit;
        Composer composer2;
        int i5;
        Modifier modifier3;
        boolean z2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(onOpenDialog, "onOpenDialog");
        Intrinsics.checkNotNullParameter(onDeeplinkClicked, "onDeeplinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1015151238);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(section) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenDialog) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeeplinkClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1015151238, i3, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable (SweepSectionV1Composable.kt:73)");
                    }
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                    Styles styles2 = new Styles() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$depositRowButtonStyle$1
                        private final /* synthetic */ Styles $$delegate_0;

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public AppBarStyle getAppBar(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-779208259);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-779208259, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-appBar> (SweepSectionV1Composable.kt:0)");
                            }
                            AppBarStyle appBar = this.$$delegate_0.getAppBar(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return appBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonBarStyle getButtonBar(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1994453060);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1994453060, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-buttonBar> (SweepSectionV1Composable.kt:0)");
                            }
                            ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return buttonBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CardStackStyle getCardStackStyle(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1401427115);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1401427115, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-cardStackStyle> (SweepSectionV1Composable.kt:0)");
                            }
                            CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return cardStackStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ChartStyle getChart(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1012652103);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1012652103, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-chart> (SweepSectionV1Composable.kt:0)");
                            }
                            ChartStyle chart = this.$$delegate_0.getChart(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return chart;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CheckboxStyle getCheckBox(Composer composer3, int i6) {
                            composer3.startReplaceGroup(569867884);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(569867884, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-checkBox> (SweepSectionV1Composable.kt:0)");
                            }
                            CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return checkBox;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1368258562);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1368258562, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-circularProgressIndicator> (SweepSectionV1Composable.kt:0)");
                            }
                            CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return circularProgressIndicator;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CommunicationCardStyle getCommunicationCard(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-82309407);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-82309407, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-communicationCard> (SweepSectionV1Composable.kt:0)");
                            }
                            CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return communicationCard;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer3, int i6) {
                            composer3.startReplaceGroup(339778771);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(339778771, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-expandableButtonTray> (SweepSectionV1Composable.kt:0)");
                            }
                            ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return expandableButtonTray;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public IconButtonStyle getIconButton(Composer composer3, int i6) {
                            composer3.startReplaceGroup(1354838500);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1354838500, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-iconButton> (SweepSectionV1Composable.kt:0)");
                            }
                            IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return iconButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public InfoBannerStyle getInfoBanner(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-508268427);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-508268427, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-infoBanner> (SweepSectionV1Composable.kt:0)");
                            }
                            InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return infoBanner;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer3, int i6) {
                            composer3.startReplaceGroup(855730018);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(855730018, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-loadingPlaceholderStyle> (SweepSectionV1Composable.kt:0)");
                            }
                            LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return loadingPlaceholderStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1425446052);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1425446052, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-markdownSpannedText> (SweepSectionV1Composable.kt:0)");
                            }
                            MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return markdownSpannedText;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NavigationBarStyle getNavigationBarStyle(Composer composer3, int i6) {
                            composer3.startReplaceGroup(1989869372);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1989869372, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-navigationBarStyle> (SweepSectionV1Composable.kt:0)");
                            }
                            NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return navigationBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NumpadStyle getNumpad(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-467179230);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-467179230, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-numpad> (SweepSectionV1Composable.kt:0)");
                            }
                            NumpadStyle numpad = this.$$delegate_0.getNumpad(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return numpad;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PlaceholderStyle getPlaceholder(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-494986962);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-494986962, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-placeholder> (SweepSectionV1Composable.kt:0)");
                            }
                            PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return placeholder;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PogStyle getPog(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1842774813);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1842774813, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-pog> (SweepSectionV1Composable.kt:0)");
                            }
                            PogStyle pog = this.$$delegate_0.getPog(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return pog;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ProgressBarStyle getProgressBarStyle(Composer composer3, int i6) {
                            composer3.startReplaceGroup(746912867);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(746912867, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-progressBarStyle> (SweepSectionV1Composable.kt:0)");
                            }
                            ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return progressBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RadioButtonStyle getRadioButton(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-306030968);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-306030968, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-radioButton> (SweepSectionV1Composable.kt:0)");
                            }
                            RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return radioButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RowStyle getRow(Composer composer3, int i6) {
                            composer3.startReplaceGroup(1657131829);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1657131829, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-row> (SweepSectionV1Composable.kt:0)");
                            }
                            RowStyle row = this.$$delegate_0.getRow(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return row;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public BentoSelectionRowStyle getSelectionRowStyle(Composer composer3, int i6) {
                            composer3.startReplaceGroup(356373263);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(356373263, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-selectionRowStyle> (SweepSectionV1Composable.kt:0)");
                            }
                            BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return selectionRowStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public SpanButtonStyle getSpanButton(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-1596779309);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1596779309, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-spanButton> (SweepSectionV1Composable.kt:0)");
                            }
                            SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return spanButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextStyle getText(Composer composer3, int i6) {
                            composer3.startReplaceGroup(1967759618);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1967759618, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-text> (SweepSectionV1Composable.kt:0)");
                            }
                            TextStyle text = this.$$delegate_0.getText(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return text;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextButtonStyle getTextButton(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-418962384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-418962384, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-textButton> (SweepSectionV1Composable.kt:0)");
                            }
                            TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return textButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextInputStyle getTextInput(Composer composer3, int i6) {
                            composer3.startReplaceGroup(-33940904);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-33940904, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-textInput> (SweepSectionV1Composable.kt:0)");
                            }
                            TextInputStyle textInput = this.$$delegate_0.getTextInput(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return textInput;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ToggleRowStyle getToggleRow(Composer composer3, int i6) {
                            composer3.startReplaceGroup(265838785);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(265838785, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-toggleRow> (SweepSectionV1Composable.kt:0)");
                            }
                            ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return toggleRow;
                        }

                        {
                            this.$$delegate_0 = this.$currentLocalStyles;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonStyle getButton(Composer composer3, int i6) {
                            composer3.startReplaceGroup(888134845);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(888134845, i6, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-button> (SweepSectionV1Composable.kt:81)");
                            }
                            ButtonStyle button = this.$currentLocalStyles.getButton(composer3, 0);
                            ButtonStyle.Style secondary = button.getSecondary();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, null, ButtonStyle.Style.m21714copyd8LSEHM$default(secondary, null, PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM()), bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), null, 9, null), 1, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return buttonStyleCopy$default;
                        }
                    };
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    int i6 = i3;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    ApiSweepSplash.SweepSectionHeader section_header = section.getSection_header();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i7 = i6 >> 6;
                    int i8 = ((i6 << 3) & 896) | (i7 & 112);
                    SweepSectionV1Header(section_header, str, onOpenDialog, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, i8, 0);
                    upsell_banner_v2 = section.getUpsell_banner_v2();
                    composerStartRestartGroup.startReplaceGroup(-2050780885);
                    Unit unit2 = null;
                    if (upsell_banner_v2 != null) {
                        r9 = 0;
                    } else {
                        r9 = 0;
                        GoldUpsellBanner(upsell_banner_v2, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), composerStartRestartGroup, 0, 0);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050773036);
                    if (!section.getData_rows().isEmpty()) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, r9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050768257);
                    it = section.getData_rows().iterator();
                    while (it.hasNext()) {
                        SweepSectionDataRow((ApiSweepSplash.DataRow) it.next(), str, onOpenDialog, null, composerStartRestartGroup, i8, 8);
                        unit2 = unit2;
                    }
                    Unit unit4 = unit2;
                    composerStartRestartGroup.endReplaceGroup();
                    depositRow = section.getDepositRow();
                    composerStartRestartGroup.startReplaceGroup(-2050757068);
                    if (depositRow != null) {
                        unit = unit4;
                        z = true;
                    } else {
                        ProvidedValue<Styles> providedValueProvides = Styles2.getLocalStyles().provides(styles2);
                        SweepSectionV1Composable3 sweepSectionV1Composable3 = new SweepSectionV1Composable3(depositRow, current, navigator, context);
                        z = true;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-162140766, true, sweepSectionV1Composable3, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050756018);
                    if (unit != null) {
                        final ApiSweepSplash.MarkdownSection markdownSection = section.getMarkdownSection();
                        if (markdownSection == null) {
                            composer2 = composerStartRestartGroup;
                            i5 = 54;
                            modifier3 = modifier5;
                            z2 = z;
                            unit = unit4;
                        } else {
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, r9);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r9);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            String markdownTitle = markdownSection.getMarkdownTitle();
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            androidx.compose.p011ui.text.TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM();
                            int i10 = BentoMarkdownText.$stable;
                            z2 = z;
                            modifier3 = modifier5;
                            i5 = 54;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, 0, 0L, 0L, false, composerStartRestartGroup, i10 << 15, 30);
                            composer2 = composerStartRestartGroup;
                            int i11 = MarkdownStyle.$stable;
                            BentoMarkdownText2.BentoMarkdownText(markdownTitle, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i11 << 6, 26);
                            String markdownSubtitle = markdownSection.getMarkdownSubtitle();
                            composer2.startReplaceGroup(-1153119364);
                            if (markdownSubtitle != null) {
                                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i9).getTextM(), 0, bentoTheme.getColors(composer2, i9).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i9).m21426getFg20d7_KjU(), false, composer2, i10 << 15, 18);
                                composer2 = composer2;
                                BentoMarkdownText2.BentoMarkdownText(markdownSubtitle, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i11 << 6, 26);
                                Unit unit5 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            final TextButton<DeeplinkAction> cta = markdownSection.getCta();
                            composer2.startReplaceGroup(-1153104634);
                            if (cta != null) {
                                SduiActionHandler3.ProvideActionHandler(onDeeplinkClicked, ComposableLambda3.rememberComposableLambda(1008099619, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$4$1$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1008099619, i12, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SweepSectionV1Composable.kt:225)");
                                        }
                                        TextButton<DeeplinkAction> textButton = cta;
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        composer3.startReplaceGroup(-1878867814);
                                        float fM21590getDefaultD9Ej5fM = !Intrinsics.areEqual(markdownSection.getCtaIncludeTopPadding(), Boolean.FALSE) ? BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                                        composer3.endReplaceGroup();
                                        SduiTextButton2.SduiTextButton(textButton, PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, fM21590getDefaultD9Ej5fM, 0.0f, 0.0f, 13, null), composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, (i7 & 14) | 48);
                                Unit unit6 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            unit = Unit.INSTANCE;
                        }
                    } else {
                        composer2 = composerStartRestartGroup;
                        i5 = 54;
                        modifier3 = modifier5;
                        z2 = z;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-2050755539);
                    if (unit == null) {
                        String markdown = section.getMarkdown();
                        if (markdown == null) {
                            unit = unit4;
                        } else {
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i12 = BentoTheme.$stable;
                            int i13 = i5;
                            boolean z3 = z2;
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion5, bentoTheme2.getSpacing(composer2, i12).m21590getDefaultD9Ej5fM(), 0.0f, composer2, 6, 2);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r9);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, r9);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g02);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            i5 = i13;
                            z2 = z3;
                            Composer composer3 = composer2;
                            composer2 = composer3;
                            BentoMarkdownText2.BentoMarkdownText(markdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i12).getTextM(), 0, 0L, 0L, false, composer3, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                            composer2.endNode();
                            unit = Unit.INSTANCE;
                        }
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-2050755250);
                    if (unit == null) {
                        SduiActionHandler3.ProvideActionHandler(onDeeplinkClicked, ComposableLambda3.rememberComposableLambda(1946572940, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i14) {
                                if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1946572940, i14, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<anonymous>.<anonymous> (SweepSectionV1Composable.kt:253)");
                                }
                                SduiTextButton2.SduiTextButton(section.getCta(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composer4, 6, 2), composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, i5), composer2, (i7 & 14) | 48);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SweepSectionV1Composable.SweepSectionV1Composable$lambda$10(section, onOpenDialog, onDeeplinkClicked, str, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Styles styles3 = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                Styles styles22 = new Styles() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$depositRowButtonStyle$1
                    private final /* synthetic */ Styles $$delegate_0;

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public AppBarStyle getAppBar(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-779208259);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-779208259, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-appBar> (SweepSectionV1Composable.kt:0)");
                        }
                        AppBarStyle appBar = this.$$delegate_0.getAppBar(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return appBar;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ButtonBarStyle getButtonBar(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1994453060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1994453060, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-buttonBar> (SweepSectionV1Composable.kt:0)");
                        }
                        ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return buttonBar;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CardStackStyle getCardStackStyle(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1401427115);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1401427115, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-cardStackStyle> (SweepSectionV1Composable.kt:0)");
                        }
                        CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return cardStackStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ChartStyle getChart(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1012652103);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1012652103, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-chart> (SweepSectionV1Composable.kt:0)");
                        }
                        ChartStyle chart = this.$$delegate_0.getChart(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return chart;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CheckboxStyle getCheckBox(Composer composer32, int i62) {
                        composer32.startReplaceGroup(569867884);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(569867884, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-checkBox> (SweepSectionV1Composable.kt:0)");
                        }
                        CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return checkBox;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1368258562);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1368258562, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-circularProgressIndicator> (SweepSectionV1Composable.kt:0)");
                        }
                        CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return circularProgressIndicator;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CommunicationCardStyle getCommunicationCard(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-82309407);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-82309407, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-communicationCard> (SweepSectionV1Composable.kt:0)");
                        }
                        CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return communicationCard;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer32, int i62) {
                        composer32.startReplaceGroup(339778771);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(339778771, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-expandableButtonTray> (SweepSectionV1Composable.kt:0)");
                        }
                        ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return expandableButtonTray;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public IconButtonStyle getIconButton(Composer composer32, int i62) {
                        composer32.startReplaceGroup(1354838500);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1354838500, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-iconButton> (SweepSectionV1Composable.kt:0)");
                        }
                        IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return iconButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public InfoBannerStyle getInfoBanner(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-508268427);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-508268427, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-infoBanner> (SweepSectionV1Composable.kt:0)");
                        }
                        InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return infoBanner;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer32, int i62) {
                        composer32.startReplaceGroup(855730018);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(855730018, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-loadingPlaceholderStyle> (SweepSectionV1Composable.kt:0)");
                        }
                        LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return loadingPlaceholderStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1425446052);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1425446052, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-markdownSpannedText> (SweepSectionV1Composable.kt:0)");
                        }
                        MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return markdownSpannedText;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public NavigationBarStyle getNavigationBarStyle(Composer composer32, int i62) {
                        composer32.startReplaceGroup(1989869372);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1989869372, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-navigationBarStyle> (SweepSectionV1Composable.kt:0)");
                        }
                        NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return navigationBarStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public NumpadStyle getNumpad(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-467179230);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-467179230, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-numpad> (SweepSectionV1Composable.kt:0)");
                        }
                        NumpadStyle numpad = this.$$delegate_0.getNumpad(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return numpad;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public PlaceholderStyle getPlaceholder(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-494986962);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-494986962, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-placeholder> (SweepSectionV1Composable.kt:0)");
                        }
                        PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return placeholder;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public PogStyle getPog(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1842774813);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1842774813, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-pog> (SweepSectionV1Composable.kt:0)");
                        }
                        PogStyle pog = this.$$delegate_0.getPog(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return pog;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ProgressBarStyle getProgressBarStyle(Composer composer32, int i62) {
                        composer32.startReplaceGroup(746912867);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(746912867, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-progressBarStyle> (SweepSectionV1Composable.kt:0)");
                        }
                        ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return progressBarStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public RadioButtonStyle getRadioButton(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-306030968);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-306030968, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-radioButton> (SweepSectionV1Composable.kt:0)");
                        }
                        RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return radioButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public RowStyle getRow(Composer composer32, int i62) {
                        composer32.startReplaceGroup(1657131829);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1657131829, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-row> (SweepSectionV1Composable.kt:0)");
                        }
                        RowStyle row = this.$$delegate_0.getRow(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return row;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public BentoSelectionRowStyle getSelectionRowStyle(Composer composer32, int i62) {
                        composer32.startReplaceGroup(356373263);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(356373263, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-selectionRowStyle> (SweepSectionV1Composable.kt:0)");
                        }
                        BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return selectionRowStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public SpanButtonStyle getSpanButton(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-1596779309);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1596779309, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-spanButton> (SweepSectionV1Composable.kt:0)");
                        }
                        SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return spanButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextStyle getText(Composer composer32, int i62) {
                        composer32.startReplaceGroup(1967759618);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1967759618, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-text> (SweepSectionV1Composable.kt:0)");
                        }
                        TextStyle text = this.$$delegate_0.getText(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return text;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextButtonStyle getTextButton(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-418962384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-418962384, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-textButton> (SweepSectionV1Composable.kt:0)");
                        }
                        TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return textButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextInputStyle getTextInput(Composer composer32, int i62) {
                        composer32.startReplaceGroup(-33940904);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-33940904, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-textInput> (SweepSectionV1Composable.kt:0)");
                        }
                        TextInputStyle textInput = this.$$delegate_0.getTextInput(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return textInput;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ToggleRowStyle getToggleRow(Composer composer32, int i62) {
                        composer32.startReplaceGroup(265838785);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(265838785, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-toggleRow> (SweepSectionV1Composable.kt:0)");
                        }
                        ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer32, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return toggleRow;
                    }

                    {
                        this.$$delegate_0 = this.$currentLocalStyles;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ButtonStyle getButton(Composer composer32, int i62) {
                        composer32.startReplaceGroup(888134845);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(888134845, i62, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<no name provided>.<get-button> (SweepSectionV1Composable.kt:81)");
                        }
                        ButtonStyle button = this.$currentLocalStyles.getButton(composer32, 0);
                        ButtonStyle.Style secondary = button.getSecondary();
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i72 = BentoTheme.$stable;
                        ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, null, ButtonStyle.Style.m21714copyd8LSEHM$default(secondary, null, PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme3.getSpacing(composer32, i72).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer32, i72).m21593getSmallD9Ej5fM()), bentoTheme3.getSpacing(composer32, i72).m21591getLargeD9Ej5fM(), null, 9, null), 1, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer32.endReplaceGroup();
                        return buttonStyleCopy$default;
                    }
                };
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                int i62 = i3;
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion7.getSetModifier());
                    Column6 column63 = Column6.INSTANCE;
                    ApiSweepSplash.SweepSectionHeader section_header2 = section.getSection_header();
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int i72 = i62 >> 6;
                    int i82 = ((i62 << 3) & 896) | (i72 & 112);
                    SweepSectionV1Header(section_header2, str, onOpenDialog, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, i82, 0);
                    upsell_banner_v2 = section.getUpsell_banner_v2();
                    composerStartRestartGroup.startReplaceGroup(-2050780885);
                    Unit unit22 = null;
                    if (upsell_banner_v2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050773036);
                    if (!section.getData_rows().isEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050768257);
                    it = section.getData_rows().iterator();
                    while (it.hasNext()) {
                    }
                    Unit unit42 = unit22;
                    composerStartRestartGroup.endReplaceGroup();
                    depositRow = section.getDepositRow();
                    composerStartRestartGroup.startReplaceGroup(-2050757068);
                    if (depositRow != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2050756018);
                    if (unit != null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-2050755539);
                    if (unit == null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-2050755250);
                    if (unit == null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static {
        float f = 12;
        BannerMinVerticalPadding = C2002Dp.m7995constructorimpl(f);
        BannerItemsPadding = C2002Dp.m7995constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GoldUpsellBanner(final ApiSweepSplash.SweepSectionUpsellBanner sweepSectionUpsellBanner, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2056995849);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sweepSectionUpsellBanner) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2056995849, i3, -1, "com.robinhood.android.dashboard.sweep.GoldUpsellBanner (SweepSectionV1Composable.kt:270)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, sweepSectionUpsellBanner.getLogging_identifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                Modifier modifier3 = modifier2;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(sweepSectionUpsellBanner);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SweepSectionV1Composable.GoldUpsellBanner$lambda$12$lambda$11(navigator, context, sweepSectionUpsellBanner);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierAutoLogEvents$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21372getBg20d7_KjU, jM21425getFg0d7_KjU, 0.0f, 0.0f, null, null, ComposableLambda3.rememberComposableLambda(-1705852130, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.GoldUpsellBanner.2
                    public final void invoke(Composer composer3, int i6) {
                        Modifier.Companion companion;
                        Object obj;
                        Composer composer4;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1705852130, i6, -1, "com.robinhood.android.dashboard.sweep.GoldUpsellBanner.<anonymous> (SweepSectionV1Composable.kt:294)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), SweepSectionV1Composable.BannerMinVerticalPadding);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(SweepSectionV1Composable.BannerItemsPadding);
                        ApiSweepSplash.SweepSectionUpsellBanner sweepSectionUpsellBanner2 = sweepSectionUpsellBanner;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String icon = sweepSectionUpsellBanner2.getIcon();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = icon != null ? ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon) : null;
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            composer3.startReplaceGroup(1423910807);
                            companion = companion2;
                            obj = null;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                            composer3.endReplaceGroup();
                            composer4 = composer3;
                        } else {
                            companion = companion2;
                            obj = null;
                            composer3.startReplaceGroup(1424122940);
                            ImageKt.Image(PainterResources_androidKt.painterResource(C13797R.drawable.gold_logo, composer3, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composer4 = composer3;
                            composer4.endReplaceGroup();
                        }
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(sweepSectionUpsellBanner2.getText_markdown(), PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, bentoTheme2.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 1, obj), null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i7).m21425getFg0d7_KjU()), 0, null, 0, 0, null, composer3, 0, 500);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 0, 6, 964);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SweepSectionV1Composable.GoldUpsellBanner$lambda$13(sweepSectionUpsellBanner, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
            long jM21372getBg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, sweepSectionUpsellBanner.getLogging_identifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            Modifier modifier32 = modifier2;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(sweepSectionUpsellBanner);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepSectionV1Composable.GoldUpsellBanner$lambda$12$lambda$11(navigator, context, sweepSectionUpsellBanner);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierAutoLogEvents$default2, false, roundedCornerShapeM5327RoundedCornerShape0680j_42, jM21372getBg20d7_KjU2, jM21425getFg0d7_KjU2, 0.0f, 0.0f, null, null, ComposableLambda3.rememberComposableLambda(-1705852130, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.GoldUpsellBanner.2
                    public final void invoke(Composer composer3, int i6) {
                        Modifier.Companion companion;
                        Object obj;
                        Composer composer4;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1705852130, i6, -1, "com.robinhood.android.dashboard.sweep.GoldUpsellBanner.<anonymous> (SweepSectionV1Composable.kt:294)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme22.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), SweepSectionV1Composable.BannerMinVerticalPadding);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(SweepSectionV1Composable.BannerItemsPadding);
                        ApiSweepSplash.SweepSectionUpsellBanner sweepSectionUpsellBanner2 = sweepSectionUpsellBanner;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String icon = sweepSectionUpsellBanner2.getIcon();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = icon != null ? ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon) : null;
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            composer3.startReplaceGroup(1423910807);
                            companion = companion2;
                            obj = null;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, bentoTheme22.getColors(composer3, i7).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                            composer3.endReplaceGroup();
                            composer4 = composer3;
                        } else {
                            companion = companion2;
                            obj = null;
                            composer3.startReplaceGroup(1424122940);
                            ImageKt.Image(PainterResources_androidKt.painterResource(C13797R.drawable.gold_logo, composer3, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composer4 = composer3;
                            composer4.endReplaceGroup();
                        }
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(sweepSectionUpsellBanner2.getText_markdown(), PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, bentoTheme22.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 1, obj), null, Color.m6701boximpl(bentoTheme22.getColors(composer4, i7).m21425getFg0d7_KjU()), 0, null, 0, 0, null, composer3, 0, 500);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme22.getColors(composer3, i7).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 0, 6, 964);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpsellBanner$lambda$12$lambda$11(Navigator navigator, Context context, ApiSweepSplash.SweepSectionUpsellBanner sweepSectionUpsellBanner) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(sweepSectionUpsellBanner.getCta_deeplink_uri()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SweepSectionDataRow(final ApiSweepSplash.DataRow dataRow, final String str, final Function1<? super SweepSectionDialogData, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(34142787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dataRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(34142787, i3, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow (SweepSectionV1Composable.kt:340)");
                }
                final String display_subtitle = dataRow.getDisplay_subtitle();
                composerStartRestartGroup.startReplaceGroup(-1548489369);
                boolean z2 = true;
                ComposableLambda composableLambdaRememberComposableLambda = display_subtitle != null ? null : ComposableLambda3.rememberComposableLambda(1662428813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionDataRow$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1662428813, i5, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow.<anonymous>.<anonymous> (SweepSectionV1Composable.kt:362)");
                        }
                        String str2 = display_subtitle;
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(null, 0, bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 19), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
                if (dataRow.getIcon_dialog() == null) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256 ? z : false) | composerStartRestartGroup.changedInstance(dataRow) | ((i3 & 112) == 32 ? z : false);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SweepSectionV1Composable.SweepSectionDataRow$lambda$17$lambda$16(dataRow, function1, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = z;
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, z2, null, null, (Function0) objRememberedValue, 6, null), null, null, ComposableLambda3.rememberComposableLambda(1578236096, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.SweepSectionDataRow.3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1578236096, i5, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow.<anonymous> (SweepSectionV1Composable.kt:343)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM());
                        ApiSweepSplash.DataRow dataRow2 = dataRow;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(dataRow2.getDisplay_title(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                        composer3.startReplaceGroup(80632636);
                        if (dataRow2.getIcon_dialog() != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(2076792898, z3, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.SweepSectionDataRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2076792898, i5, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow.<anonymous> (SweepSectionV1Composable.kt:372)");
                        }
                        BentoText2.m20747BentoText38GnDrw(dataRow.getDisplay_value(), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, false, null, composer2, 199680, 0, 1990);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SweepSectionV1Composable.SweepSectionDataRow$lambda$18(dataRow, str, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final String display_subtitle2 = dataRow.getDisplay_subtitle();
            composerStartRestartGroup.startReplaceGroup(-1548489369);
            boolean z22 = true;
            if (display_subtitle2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (dataRow.getIcon_dialog() == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 896) != 256 ? z : false) | composerStartRestartGroup.changedInstance(dataRow) | ((i3 & 112) == 32 ? z : false);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepSectionV1Composable.SweepSectionDataRow$lambda$17$lambda$16(dataRow, function1, str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                boolean z32 = z;
                Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, z22, null, null, (Function0) objRememberedValue, 6, null), null, null, ComposableLambda3.rememberComposableLambda(1578236096, z32, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.SweepSectionDataRow.3
                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1578236096, i5, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow.<anonymous> (SweepSectionV1Composable.kt:343)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM());
                        ApiSweepSplash.DataRow dataRow2 = dataRow;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(dataRow2.getDisplay_title(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                        composer3.startReplaceGroup(80632636);
                        if (dataRow2.getIcon_dialog() != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(2076792898, z32, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt.SweepSectionDataRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2076792898, i5, -1, "com.robinhood.android.dashboard.sweep.SweepSectionDataRow.<anonymous> (SweepSectionV1Composable.kt:372)");
                        }
                        BentoText2.m20747BentoText38GnDrw(dataRow.getDisplay_value(), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, false, null, composer2, 199680, 0, 1990);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionDataRow$lambda$17$lambda$16(ApiSweepSplash.DataRow dataRow, Function1 function1, String str) {
        ApiSweepSplash.Dialog icon_dialog = dataRow.getIcon_dialog();
        if (icon_dialog != null) {
            function1.invoke(new SweepSectionDialogData(icon_dialog, str, SweepSectionDialogData.Style.MODAL, false, 8, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SweepSectionV1Header(final ApiSweepSplash.SweepSectionHeader sweepSectionHeader, final String str, final Function1<? super SweepSectionDialogData, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-417903);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sweepSectionHeader) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-417903, i3, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Header (SweepSectionV1Composable.kt:400)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(sweepSectionHeader);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SweepSectionV1Composable.SweepSectionV1Header$lambda$22$lambda$20$lambda$19(function1, sweepSectionHeader, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.CASH_SWEEP_SECTION, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(sweepSectionHeader.getDisplay_title(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(554739923);
                if (sweepSectionHeader.getInfo_tag().getLabel().length() > 0) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_menu_info, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 56);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1176271216);
                if (sweepSectionHeader.getInfo_tag().getLabel().length() > 0) {
                    int i6 = WhenMappings.$EnumSwitchMapping$0[sweepSectionHeader.getInfo_tag().getStyle().ordinal()];
                    if (i6 == 1) {
                        composerStartRestartGroup.startReplaceGroup(1176274448);
                        InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(sweepSectionHeader.getInfo_tag().getLabel(), null, null, null, false, null, null, composerStartRestartGroup, 1572864, 62);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (i6 != 2) {
                            composerStartRestartGroup.startReplaceGroup(1176272880);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1176279314);
                        BentoSparkleInfoTag.BentoSparkleInfoTag(sweepSectionHeader.getInfo_tag().getLabel(), null, sweepSectionHeader.getInfo_tag().getLabel(), null, false, null, composerStartRestartGroup, 196656, 24);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SweepSectionV1Composable.SweepSectionV1Header$lambda$23(sweepSectionHeader, str, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(spaceBetween2, centerVertically3, composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Alignment.Vertical centerVertically22 = companion4.getCenterVertically();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
                Modifier.Companion companion32 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(sweepSectionHeader);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SweepSectionV1Composable.SweepSectionV1Header$lambda$22$lambda$20$lambda$19(function1, sweepSectionHeader, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion32, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.CASH_SWEEP_SECTION, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically22, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(sweepSectionHeader.getDisplay_title(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(554739923);
                        if (sweepSectionHeader.getInfo_tag().getLabel().length() > 0) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1176271216);
                        if (sweepSectionHeader.getInfo_tag().getLabel().length() > 0) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionV1Header$lambda$22$lambda$20$lambda$19(Function1 function1, ApiSweepSplash.SweepSectionHeader sweepSectionHeader, String str) {
        function1.invoke(new SweepSectionDialogData(sweepSectionHeader.getIcon_dialog(), str, null, true, 4, null));
        return Unit.INSTANCE;
    }
}
