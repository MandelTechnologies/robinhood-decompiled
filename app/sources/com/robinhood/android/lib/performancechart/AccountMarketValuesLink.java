package com.robinhood.android.lib.performancechart;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.contracts.AccountMarketValuesContract;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountMarketValuesLink.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u0010\u0010\n\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"AccountMarketValuesLink", "", "accountNumber", "", "marketValuesType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "displaySpan", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkIdentifier", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.AccountMarketValuesLinkKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountMarketValuesLink {
    public static final String LinkIdentifier = "account-market-values-link";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountMarketValuesLink$lambda$2(String str, AccountMarketValuesType accountMarketValuesType, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountMarketValuesLink(str, accountMarketValuesType, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountMarketValuesLink(final String accountNumber, final AccountMarketValuesType marketValuesType, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        int i4;
        Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(marketValuesType, "marketValuesType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1312002883);
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
            i3 |= composerStartRestartGroup.changed(marketValuesType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1312002883, i3, -1, "com.robinhood.android.lib.performancechart.AccountMarketValuesLink (AccountMarketValuesLink.kt:25)");
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    String strStringResource = StringResources_androidKt.stringResource(C20506R.string.market_values, composerStartRestartGroup, 0);
                    long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.lib.performancechart.AccountMarketValuesLinkKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountMarketValuesLink.AccountMarketValuesLink$lambda$1$lambda$0(navigator, context, accountNumber, marketValuesType, str2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function0);
                        objRememberedValue = function0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21426getFg20d7_KjU, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, LinkIdentifier, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.AccountMarketValuesLinkKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountMarketValuesLink.AccountMarketValuesLink$lambda$2(accountNumber, marketValuesType, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                String strStringResource2 = StringResources_androidKt.stringResource(C20506R.string.market_values, composerStartRestartGroup, 0);
                long jM21426getFg20d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    Function0 function02 = new Function0() { // from class: com.robinhood.android.lib.performancechart.AccountMarketValuesLinkKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountMarketValuesLink.AccountMarketValuesLink$lambda$1$lambda$0(navigator, context, accountNumber, marketValuesType, str2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function02);
                    objRememberedValue = function02;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    BentoIcon2.m20644BentoIconFU0evQE(size242, strStringResource2, jM21426getFg20d7_KjU2, ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, LinkIdentifier, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountMarketValuesLink$lambda$1$lambda$0(Navigator navigator, Context context, String str, AccountMarketValuesType accountMarketValuesType, String str2) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AccountMarketValuesContract.Key(str, accountMarketValuesType, str2 == null ? AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT : str2), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
