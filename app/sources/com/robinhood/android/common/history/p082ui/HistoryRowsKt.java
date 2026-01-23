package com.robinhood.android.common.history.p082ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.compose.LazyFoundationExtensions;
import androidx.paging.compose.LazyPagingItems;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HistoryRows.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u008d\u0001\u0010 \u001a\u00020\u0004*\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!\u001a\u0083\u0001\u0010 \u001a\u00020\u0004*\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\"2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010#\u001au\u0010&\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\"2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001bH\u0007¢\u0006\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "text", "", "DefaultHistoryHeader", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "HistoryFooterTextButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "destination", "DefaultHistoryFooter", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentKey;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/LazyListScope;", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "historyItems", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/ExtensionFunctionType;", "header", Footer.f10637type, "", "maxItems", "", "isFromCryptoSource", "compensateForCaret", "alwaysShowFooter", "keyPrefix", "historySection", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IZZZLjava/lang/String;)V", "Lkotlinx/collections/immutable/ImmutableList;", "(Landroidx/compose/foundation/lazy/LazyListScope;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZZZLjava/lang/String;)V", "showFooter", "logRowEvents", "HistorySection", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZZLandroidx/compose/runtime/Composer;II)V", "DefaultHistoryPageSize", "I", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HistoryRowsKt {
    public static final int DefaultHistoryPageSize = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultHistoryFooter$lambda$4(Modifier modifier, String str, FragmentKey fragmentKey, int i, int i2, Composer composer, int i3) {
        DefaultHistoryFooter(modifier, str, fragmentKey, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultHistoryHeader$lambda$0(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        DefaultHistoryHeader(modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryFooterTextButton$lambda$1(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistoryFooterTextButton(str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistorySection$lambda$8(ImmutableList immutableList, Modifier modifier, Function2 function2, Function2 function22, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Composer composer, int i3) {
        HistorySection(immutableList, modifier, function2, function22, z, z2, z3, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void DefaultHistoryHeader(Modifier modifier, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        String strStringResource;
        Modifier modifier3;
        final Modifier modifier4;
        Composer composer2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1614595546);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                int i5 = composerStartRestartGroup.changed(str2) ? 32 : 16;
                i3 |= i5;
            } else {
                str2 = str;
            }
            i3 |= i5;
        } else {
            str2 = str;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(C11183R.string.history_title, composerStartRestartGroup, 0);
                    i3 &= -113;
                } else {
                    strStringResource = str2;
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                String str4 = str2;
                modifier3 = modifier2;
                strStringResource = str4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614595546, i3, -1, "com.robinhood.android.common.history.ui.DefaultHistoryHeader (HistoryRows.kt:40)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 2, null);
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            str3 = strStringResource;
            BentoText2.m20747BentoText38GnDrw(str3, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, (i3 >> 3) & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier4 = modifier2;
            str3 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryRowsKt.DefaultHistoryHeader$lambda$0(modifier4, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryFooterTextButton(final String text, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1243100552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1243100552, i3, -1, "com.robinhood.android.common.history.ui.HistoryFooterTextButton (HistoryRows.kt:57)");
                }
                float value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                float value2 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoTextButton2.m20715BentoTextButtonPIknLig(onClick, text, PaddingKt.m5146paddingqDBjuR0$default(modifier4, value, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), value2, 0.0f, 8, null), null, null, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU()), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HistoryRowsKt.HistoryFooterTextButton$lambda$1(text, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float value3 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
            float value22 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            BentoTextButton2.m20715BentoTextButtonPIknLig(onClick, text, PaddingKt.m5146paddingqDBjuR0$default(modifier4, value3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), value22, 0.0f, 8, null), null, null, false, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU()), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultHistoryFooter(Modifier modifier, String str, FragmentKey fragmentKey, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        FragmentKey fragmentKey2;
        String strStringResource;
        Modifier modifier3;
        final FragmentKey key;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        final FragmentKey fragmentKey3;
        final Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2017907127);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                int i5 = composerStartRestartGroup.changed(str2) ? 32 : 16;
                i3 |= i5;
            } else {
                str2 = str;
            }
            i3 |= i5;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                fragmentKey2 = fragmentKey;
                int i6 = composerStartRestartGroup.changedInstance(fragmentKey2) ? 256 : 128;
                i3 |= i6;
            } else {
                fragmentKey2 = fragmentKey;
            }
            i3 |= i6;
        } else {
            fragmentKey2 = fragmentKey;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composerStartRestartGroup, 0);
                    i3 &= -113;
                } else {
                    strStringResource = str2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    modifier3 = modifier5;
                    str2 = strStringResource;
                    key = new AccountsHistoryContract.Key(null, null, null, null, false, null, 63, null);
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2017907127, i3, -1, "com.robinhood.android.common.history.ui.DefaultHistoryFooter (HistoryRows.kt:79)");
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                    Modifier modifier6 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(key);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HistoryRowsKt.DefaultHistoryFooter$lambda$3$lambda$2(navigator, context, key);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    HistoryFooterTextButton(str2, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fragmentKey3 = key;
                    modifier4 = modifier6;
                } else {
                    modifier3 = modifier5;
                    str2 = strStringResource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            }
            key = fragmentKey2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
            Modifier modifier62 = modifier3;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(key);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryRowsKt.DefaultHistoryFooter$lambda$3$lambda$2(navigator, context, key);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                HistoryFooterTextButton(str2, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                fragmentKey3 = key;
                modifier4 = modifier62;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            fragmentKey3 = fragmentKey2;
        }
        final String str3 = str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryRowsKt.DefaultHistoryFooter$lambda$4(modifier4, str3, fragmentKey3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultHistoryFooter$lambda$3$lambda$2(Navigator navigator, Context context, FragmentKey fragmentKey) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public static final void historySection(LazyListScope lazyListScope, final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> historyItems, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> header, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> footer, int i, final boolean z, final boolean z2, boolean z3, final String keyPrefix) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        LazyListScope.item$default(lazyListScope, keyPrefix + "history_header", null, header, 2, null);
        LazyListScope.items$default(lazyListScope, Math.min(historyItems.getItemCount(), i), LazyFoundationExtensions.itemKey(historyItems, new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryRowsKt.historySection$lambda$5(keyPrefix, (StatefulHistoryEvent) obj);
            }
        }), null, ComposableLambda3.composableLambdaInstance(-1443454087, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt.historySection.2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1443454087, i3, -1, "com.robinhood.android.common.history.ui.historySection.<anonymous> (HistoryRows.kt:125)");
                }
                StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent = historyItems.get(i2);
                if (statefulHistoryEvent != null) {
                    HistoryRow4.HistoryRow(statefulHistoryEvent, null, z, z2, keyPrefix, null, composer, 0, 34);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 4, null);
        if (historyItems.getItemCount() > i || z3) {
            LazyListScope.item$default(lazyListScope, keyPrefix + "history_footer", null, footer, 2, null);
            return;
        }
        LazyListScope.item$default(lazyListScope, keyPrefix + "history_footer", null, ComposableSingletons$HistoryRowsKt.INSTANCE.m12223getLambda$1943587714$lib_history_row_externalDebug(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object historySection$lambda$5(String str, StatefulHistoryEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return str + it.getHistoryEvent().getId();
    }

    public static final void historySection(LazyListScope lazyListScope, final ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyItems, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> header, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> footer, final boolean z, final boolean z2, boolean z3, final String keyPrefix) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        LazyListScope.item$default(lazyListScope, keyPrefix + "history_header", null, header, 2, null);
        LazyListScope.items$default(lazyListScope, historyItems.size(), new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryRowsKt.historySection$lambda$6(keyPrefix, historyItems, ((Integer) obj).intValue());
            }
        }, null, ComposableLambda3.composableLambdaInstance(-444905130, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt.historySection.4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-444905130, i2, -1, "com.robinhood.android.common.history.ui.historySection.<anonymous> (HistoryRows.kt:175)");
                }
                HistoryRow4.HistoryRow(historyItems.get(i), null, z, z2, keyPrefix, null, composer, 0, 34);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 4, null);
        if (z3) {
            LazyListScope.item$default(lazyListScope, keyPrefix + "history_footer", null, footer, 2, null);
            return;
        }
        LazyListScope.item$default(lazyListScope, keyPrefix + "history_footer", null, ComposableSingletons$HistoryRowsKt.INSTANCE.m12222getLambda$1751498213$lib_history_row_externalDebug(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object historySection$lambda$6(String str, ImmutableList immutableList, int i) {
        return str + ((StatefulHistoryEvent) immutableList.get(i)).getHistoryEvent().getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistorySection(final ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyItems, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> lambda$1107930705$lib_history_row_externalDebug;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z8;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifierAutoLogEvents$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        Composer composerStartRestartGroup = composer.startRestartGroup(1846702028);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(historyItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    lambda$1107930705$lib_history_row_externalDebug = function2;
                    i3 |= composerStartRestartGroup.changedInstance(lambda$1107930705$lib_history_row_externalDebug) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function23 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z5 = z;
                            i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                z6 = z2;
                                i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                            }
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                            i9 = i2 & 128;
                            if (i9 != 0) {
                                if ((i & 12582912) == 0) {
                                    i10 = i9;
                                    i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z8 = z4;
                                    function24 = lambda$1107930705$lib_history_row_externalDebug;
                                    function25 = function23;
                                    z9 = z6;
                                    z10 = z3;
                                } else {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        lambda$1107930705$lib_history_row_externalDebug = ComposableSingletons$HistoryRowsKt.INSTANCE.getLambda$1107930705$lib_history_row_externalDebug();
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function2M12225getLambda$754850941$lib_history_row_externalDebug = i5 == 0 ? ComposableSingletons$HistoryRowsKt.INSTANCE.m12225getLambda$754850941$lib_history_row_externalDebug() : function23;
                                    if (i6 != 0) {
                                        z5 = false;
                                    }
                                    boolean z11 = i7 == 0 ? true : z6;
                                    z7 = i8 == 0 ? z3 : true;
                                    boolean z12 = i10 == 0 ? false : z4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1846702028, i3, -1, "com.robinhood.android.common.history.ui.HistorySection (HistoryRows.kt:221)");
                                    }
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    int i12 = i3;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    int i13 = i12 >> 6;
                                    lambda$1107930705$lib_history_row_externalDebug.invoke(composerStartRestartGroup, Integer.valueOf(i13 & 14));
                                    composerStartRestartGroup.startReplaceGroup(644950406);
                                    for (StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEvent : historyItems) {
                                        if (z12) {
                                            modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, false, false, false, true, false, null, 111, null);
                                        } else {
                                            modifierAutoLogEvents$default = Modifier.INSTANCE;
                                        }
                                        HistoryRow4.HistoryRow(statefulHistoryEvent, modifierAutoLogEvents$default, z5, z11, null, null, composerStartRestartGroup, i13 & 8064, 48);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(644963142);
                                    if (z7) {
                                        function2M12225getLambda$754850941$lib_history_row_externalDebug.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z8 = z12;
                                    function24 = lambda$1107930705$lib_history_row_externalDebug;
                                    z9 = z11;
                                    z10 = z7;
                                    function25 = function2M12225getLambda$754850941$lib_history_row_externalDebug;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier3 = modifier2;
                                    final boolean z13 = z5;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryRowsKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return HistoryRowsKt.HistorySection$lambda$8(historyItems, modifier3, function24, function25, z13, z9, z10, z8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 12582912;
                            i10 = i9;
                            if ((i3 & 4793491) == 4793490) {
                                if (i11 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                int i122 = i3;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    int i132 = i122 >> 6;
                                    lambda$1107930705$lib_history_row_externalDebug.invoke(composerStartRestartGroup, Integer.valueOf(i132 & 14));
                                    composerStartRestartGroup.startReplaceGroup(644950406);
                                    while (r3.hasNext()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(644963142);
                                    if (z7) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z8 = z12;
                                    function24 = lambda$1107930705$lib_history_row_externalDebug;
                                    z9 = z11;
                                    z10 = z7;
                                    function25 = function2M12225getLambda$754850941$lib_history_row_externalDebug;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z6 = z2;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                        }
                        i10 = i9;
                        if ((i3 & 4793491) == 4793490) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z5 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z6 = z2;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z5 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z6 = z2;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            lambda$1107930705$lib_history_row_externalDebug = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function23 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z5 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z6 = z2;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        lambda$1107930705$lib_history_row_externalDebug = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function23 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z6 = z2;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
