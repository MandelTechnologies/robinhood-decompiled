package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.lib.performancechart.AccountMarketValuesLink;
import com.robinhood.android.lib.performancechart.PerformanceChartComposable;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable3;
import com.robinhood.android.options.sharedui.components.banners.InfoBannerComposable5;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomeChart.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aG\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"AssetHomeChart", "", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "assetTitle", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "showOptionLevel3EntryPoint", "", "showInfoIconInHeader", "onChartLoaded", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/models/portfolio/api/AssetType;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AssetHomeChartHeader", "marketValuesType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "showInfoIcon", "displaySpan", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeChart {

    /* compiled from: AssetHomeChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.assethomes.AssetHomeChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeChart$lambda$0(String str, PerformanceChartType performanceChartType, AssetType assetType, String str2, BrokerageAccountType brokerageAccountType, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        AssetHomeChart(str, performanceChartType, assetType, str2, brokerageAccountType, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeChartHeader$lambda$5(BrokerageAccountType brokerageAccountType, AccountMarketValuesType accountMarketValuesType, String str, String str2, boolean z, boolean z2, String str3, int i, Composer composer, int i2) {
        AssetHomeChartHeader(brokerageAccountType, accountMarketValuesType, str, str2, z, z2, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetHomeChart(final String accountNumber, final PerformanceChartType chartType, final AssetType assetType, final String assetTitle, final BrokerageAccountType brokerageAccountType, boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Function0<Unit> function02;
        int i6;
        AccountMarketValuesType accountMarketValuesType;
        Composer composer2;
        final Function0<Unit> function03;
        final boolean z5;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetTitle, "assetTitle");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Composer composerStartRestartGroup = composer.startRestartGroup(556661665);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(chartType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(assetType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(assetTitle) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    final boolean z7 = i7 == 0 ? false : z3;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    Function0<Unit> function04 = i5 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(556661665, i3, -1, "com.robinhood.android.assethomes.AssetHomeChart (AssetHomeChart.kt:41)");
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
                    if (i6 != 1) {
                        accountMarketValuesType = AccountMarketValuesType.EQUITY;
                    } else {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                throw new IllegalStateException("Futures not supported");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        accountMarketValuesType = AccountMarketValuesType.OPTIONS;
                    }
                    int i8 = i3;
                    final AccountMarketValuesType accountMarketValuesType2 = accountMarketValuesType;
                    final boolean z8 = z4;
                    boolean z9 = z7;
                    composer2 = composerStartRestartGroup;
                    PerformanceChartComposable.PerformanceChartComposable(accountNumber, chartType, accountMarketValuesType2, null, false, null, null, ComposableLambda3.rememberComposableLambda(1286734959, true, new Function4<Column5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt.AssetHomeChart.1
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, String str, Composer composer3, Integer num) {
                            invoke(column5, str, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 PerformanceChartComposable, String str, Composer composer3, int i9) {
                            Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                            if ((i9 & 48) == 0) {
                                i9 |= composer3.changed(str) ? 32 : 16;
                            }
                            if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1286734959, i9, -1, "com.robinhood.android.assethomes.AssetHomeChart.<anonymous> (AssetHomeChart.kt:50)");
                            }
                            AssetHomeChart.AssetHomeChartHeader(brokerageAccountType, accountMarketValuesType2, assetTitle, accountNumber, z8, z7, str, composer3, (i9 << 15) & 3670016);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), false, ComposableLambda3.rememberComposableLambda(-786330999, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt.AssetHomeChart.2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str, Composer composer3, Integer num) {
                            invoke(row5, str, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 PerformanceChartComposable, String str, Composer composer3, int i9) {
                            Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                            if ((i9 & 48) == 0) {
                                i9 |= composer3.changed(str) ? 32 : 16;
                            }
                            if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-786330999, i9, -1, "com.robinhood.android.assethomes.AssetHomeChart.<anonymous> (AssetHomeChart.kt:61)");
                            }
                            if (!z8) {
                                AccountMarketValuesLink.AccountMarketValuesLink(accountNumber, accountMarketValuesType2, str, null, composer3, (i9 << 3) & 896, 8);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, function04, null, null, null, composer2, (i8 & 14) | 817889280 | (i8 & 112), (i8 >> 15) & 896, 60792);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                    z5 = z9;
                    z6 = z8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function03 = function02;
                    composer2 = composerStartRestartGroup;
                    z5 = z3;
                    z6 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AssetHomeChart.AssetHomeChart$lambda$0(accountNumber, chartType, assetType, assetTitle, brokerageAccountType, z5, z6, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            z4 = z2;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i3 & 4793491) != 4793490) {
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
                if (i6 != 1) {
                }
                int i82 = i3;
                final AccountMarketValuesType accountMarketValuesType22 = accountMarketValuesType;
                final boolean z82 = z4;
                boolean z92 = z7;
                composer2 = composerStartRestartGroup;
                PerformanceChartComposable.PerformanceChartComposable(accountNumber, chartType, accountMarketValuesType22, null, false, null, null, ComposableLambda3.rememberComposableLambda(1286734959, true, new Function4<Column5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt.AssetHomeChart.1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, String str, Composer composer3, Integer num) {
                        invoke(column5, str, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 PerformanceChartComposable, String str, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                        if ((i9 & 48) == 0) {
                            i9 |= composer3.changed(str) ? 32 : 16;
                        }
                        if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1286734959, i9, -1, "com.robinhood.android.assethomes.AssetHomeChart.<anonymous> (AssetHomeChart.kt:50)");
                        }
                        AssetHomeChart.AssetHomeChartHeader(brokerageAccountType, accountMarketValuesType22, assetTitle, accountNumber, z82, z7, str, composer3, (i9 << 15) & 3670016);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, ComposableLambda3.rememberComposableLambda(-786330999, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt.AssetHomeChart.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str, Composer composer3, Integer num) {
                        invoke(row5, str, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 PerformanceChartComposable, String str, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                        if ((i9 & 48) == 0) {
                            i9 |= composer3.changed(str) ? 32 : 16;
                        }
                        if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-786330999, i9, -1, "com.robinhood.android.assethomes.AssetHomeChart.<anonymous> (AssetHomeChart.kt:61)");
                        }
                        if (!z82) {
                            AccountMarketValuesLink.AccountMarketValuesLink(accountNumber, accountMarketValuesType22, str, null, composer3, (i9 << 3) & 896, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, function04, null, null, null, composer2, (i82 & 14) | 817889280 | (i82 & 112), (i82 >> 15) & 896, 60792);
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function04;
                z5 = z92;
                z6 = z82;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        z4 = z2;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void AssetHomeChartHeader(final BrokerageAccountType brokerageAccountType, final AccountMarketValuesType marketValuesType, final String assetTitle, final String accountNumber, final boolean z, final boolean z2, final String str, Composer composer, final int i) {
        int i2;
        int i3;
        Navigator navigator;
        Modifier.Companion companion;
        float f;
        final String str2;
        Modifier.Companion companion2;
        int i4;
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(marketValuesType, "marketValuesType");
        Intrinsics.checkNotNullParameter(assetTitle, "assetTitle");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(829059390);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(marketValuesType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(assetTitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(accountNumber) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829059390, i2, -1, "com.robinhood.android.assethomes.AssetHomeChartHeader (AssetHomeChart.kt:84)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1955897077);
            if (brokerageAccountType.isRetirement()) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                f = 0.0f;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 7, null);
                String strStringResource = StringResources_androidKt.stringResource(BrokerageAccountTypes2.getDisplayNameRes(brokerageAccountType), composerStartRestartGroup, 0);
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                navigator = navigator2;
                i3 = i2;
                companion = companion3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8172);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = i2;
                navigator = navigator2;
                companion = companion3;
                f = 0.0f;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            final Navigator navigator3 = navigator;
            boolean z3 = true;
            Composer composer2 = composerStartRestartGroup;
            int i7 = i3;
            Modifier.Companion companion6 = companion;
            BentoText2.m20747BentoText38GnDrw(assetTitle, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composer2, (i3 >> 6) & 14, 0, 8190);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.startReplaceGroup(-998779521);
            if (z) {
                companion2 = companion6;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                i4 = i7;
                str2 = accountNumber;
                AccountMarketValuesLink.AccountMarketValuesLink(str2, marketValuesType, str, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, ((i4 >> 9) & 14) | (i4 & 112) | ((i4 >> 12) & 896), 0);
            } else {
                str2 = accountNumber;
                companion2 = companion6;
                i4 = i7;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-998765146);
            if (z2) {
                Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator3) | composerStartRestartGroup.changedInstance(context);
                if ((i4 & 7168) != 2048) {
                    z3 = false;
                }
                boolean z4 = zChangedInstance | z3;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AssetHomeChart.AssetHomeChartHeader$lambda$4$lambda$3$lambda$2$lambda$1(navigator3, context, str2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBannerComposable3.m17015OptionsLevel3EntryPointTagComposableuDo3WH8(strStringResource2, null, (Function0) objRememberedValue, 0L, InfoBannerComposable5.OPTION_ASSET_HOME, composerStartRestartGroup, 24576, 10);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeChartKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetHomeChart.AssetHomeChartHeader$lambda$5(brokerageAccountType, marketValuesType, assetTitle, accountNumber, z, z2, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeChartHeader$lambda$4$lambda$3$lambda$2$lambda$1(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new OptionOnboarding(new OptionOnboarding2.AccountNumber(str), new OptionOnboarding.OptionOnboardingSource.Legacy(AssetHomePositionListSections.OPTIONS_PNL_ENTRY_POINT_SOURCE), null, 4, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
