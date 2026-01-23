package com.robinhood.android.retirement.onboarding.accountselection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpAccountSelection;
import com.robinhood.android.retirement.onboarding.C27032R;
import com.robinhood.android.retirement.onboarding.UtilsKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AccountSelection.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aZ\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection$AccountRow;", "state", "", "loading", "Lkotlin/Function1;", "Lcom/robinhood/models/api/BrokerageAccountType;", "", "onAccountTypeSelected", "AccountSelectionCard", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection$AccountRow;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "loggingIdentifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Lkotlin/Function0;", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "isEnabled", "SelectionRow-OadGlvw", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", EquityOrderFormRowState2.SelectionRowTestTag, "AccountComparisonInfoBanner", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionCallbacks;", "callbacks", "showMaybeLaterButton", "AccountSelectionScreen", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;ZLcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionCallbacks;ZLandroidx/compose/runtime/Composer;II)V", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountSelectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountComparisonInfoBanner$lambda$6(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountComparisonInfoBanner(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionCard$lambda$2(Modifier modifier, ApiRetirementSignUpAccountSelection.AccountRow accountRow, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        AccountSelectionCard(modifier, accountRow, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionScreen$lambda$17(Modifier modifier, ApiRetirementSignUpAccountSelection apiRetirementSignUpAccountSelection, boolean z, AccountSelectionCallbacks accountSelectionCallbacks, boolean z2, int i, int i2, Composer composer, int i3) {
        AccountSelectionScreen(modifier, apiRetirementSignUpAccountSelection, z, accountSelectionCallbacks, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow_OadGlvw$lambda$5(String str, long j, Function0 function0, Function3 function3, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        m18158SelectionRowOadGlvw(str, j, function0, function3, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AccountSelectionCard(Modifier modifier, final ApiRetirementSignUpAccountSelection.AccountRow state, final boolean z, final Function1<? super BrokerageAccountType, Unit> onAccountTypeSelected, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final long jM21427getFg30d7_KjU;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAccountTypeSelected, "onAccountTypeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(60964418);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountTypeSelected) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(60964418, i3, -1, "com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionCard (AccountSelection.kt:55)");
            }
            boolean z2 = state.getIs_enabled() && !z;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1542726171);
                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1542725307);
                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            long upsellColor = UtilsKt.getUpsellColor(state.getBrokerage_account_type(), composerStartRestartGroup, 0);
            String logging_identifier = state.getLogging_identifier();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i3 & 7168) == 2048) | composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelectionKt.AccountSelectionCard$lambda$1$lambda$0(onAccountTypeSelected, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            m18158SelectionRowOadGlvw(logging_identifier, upsellColor, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(798048488, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt.AccountSelectionCard.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SelectionRow, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(SelectionRow) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(798048488, i6, -1, "com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionCard.<anonymous> (AccountSelection.kt:66)");
                    }
                    Modifier modifierWeight$default = Row5.weight$default(SelectionRow, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM());
                    ApiRetirementSignUpAccountSelection.AccountRow accountRow = state;
                    long j = jM21427getFg30d7_KjU;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(accountRow.getTitle(), null, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 24576, 0, 8170);
                    BentoText2.m20747BentoText38GnDrw(accountRow.getDescription(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (state.getHas_pending_application()) {
                        composer2.startReplaceGroup(2019188375);
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C27032R.string.retirement_account_selection_pending, composer2, 0), null, null, null, null, false, null, null, composer2, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2019388635);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24), null, jM21427getFg30d7_KjU, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier4, z2, composerStartRestartGroup, ((i3 << 12) & 57344) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionKt.AccountSelectionCard$lambda$2(modifier3, state, z, onAccountTypeSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionCard$lambda$1$lambda$0(Function1 function1, ApiRetirementSignUpAccountSelection.AccountRow accountRow) {
        function1.invoke(accountRow.getBrokerage_account_type());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
    /* renamed from: SelectionRow-OadGlvw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m18158SelectionRowOadGlvw(final String str, final long j, final Function0<Unit> function0, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        int i4;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1515367453);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1515367453, i3, -1, "com.robinhood.android.retirement.onboarding.accountselection.SelectionRow (AccountSelection.kt:107)");
                    }
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), !z5 ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                    composerStartRestartGroup.startReplaceGroup(-274188773);
                    long jM21371getBg0d7_KjU = !z5 ? j2 : bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(modifierM4876borderxT4_qwU, jM21371getBg0d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = (i3 & 896) != 256;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSelectionKt.SelectionRow_OadGlvw$lambda$4$lambda$3(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z6 = z5;
                    Modifier modifier4 = modifier3;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, z5, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM());
                    int i7 = (i3 & 7168) | 384;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i7 >> 6) & 112) | 6));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z6;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectionKt.SelectionRow_OadGlvw$lambda$5(str, j, function0, function3, modifier5, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl2, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), !z5 ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_42);
                composerStartRestartGroup.startReplaceGroup(-274188773);
                if (!z5) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClip2 = Clip.clip(Background3.m4871backgroundbw27NRU(modifierM4876borderxT4_qwU2, jM21371getBg0d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 896) != 256) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionKt.SelectionRow_OadGlvw$lambda$4$lambda$3(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z62 = z5;
                    Modifier modifier42 = modifier3;
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, z5, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM());
                    int i72 = (i3 & 7168) | 384;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i72 >> 6) & 112) | 6));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z62;
                        modifier2 = modifier42;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow_OadGlvw$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void AccountComparisonInfoBanner(final Modifier modifier, Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(305791577);
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
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onClick;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(305791577, i3, -1, "com.robinhood.android.retirement.onboarding.accountselection.AccountComparisonInfoBanner (AccountSelection.kt:152)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C27032R.string.retirement_account_comparison_info_banner_text, composerStartRestartGroup, 0);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.LIGHTBULB_24);
            String strStringResource2 = StringResources_androidKt.stringResource(C27032R.string.retirement_account_comparison_info_banner_cta, composerStartRestartGroup, 0);
            int i5 = (i3 & 14) | (BentoIcon4.Size24.$stable << 6) | ((i3 << 9) & 57344);
            Modifier modifier2 = modifier;
            function0 = onClick;
            BentoInfoBanner2.BentoPinnedInfoBanner(modifier2, strStringResource, size24, strStringResource2, function0, composerStartRestartGroup, i5, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionKt.AccountComparisonInfoBanner$lambda$6(modifier, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionScreen(Modifier modifier, final ApiRetirementSignUpAccountSelection state, final boolean z, final AccountSelectionCallbacks callbacks, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        boolean z4;
        ScrollState scrollStateRememberScrollState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Composer composer3;
        int i4;
        Object objRememberedValue;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1244421635);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                z4 = i6 == 0 ? false : z3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1244421635, i3, -1, "com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionScreen (AccountSelection.kt:178)");
                }
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM(), 5, null);
                Modifier modifier5 = modifier4;
                float f = 0.0f;
                int i8 = i3;
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                int i9 = 1;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BentoMarkdownText2.BentoMarkdownText(state.getDescription_markdown(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                composer2.endNode();
                int i10 = 0;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), companion.getStart(), composer2, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                composer2.startReplaceGroup(1049872746);
                for (ApiRetirementSignUpAccountSelection.AccountRow accountRow : state.getAccount_rows()) {
                    composer2.startReplaceGroup(5004770);
                    int i11 = i8;
                    int i12 = ((i11 & 7168) == 2048 || ((i11 & 4096) != 0 && composer2.changedInstance(callbacks))) ? i9 : i10;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (i12 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new AccountSelectionKt$AccountSelectionScreen$1$1$2$1$1$1(callbacks);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    AccountSelectionCard(null, accountRow, z, (Function1) ((KFunction) objRememberedValue2), composer4, i11 & 896, 1);
                    i10 = i10;
                    i8 = i11;
                    f = f;
                    i9 = i9;
                    composer2 = composer4;
                }
                float f2 = f;
                composer3 = composer2;
                int i13 = i9;
                int i14 = i8;
                boolean z6 = i10;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1633490746);
                int i15 = i14 & 7168;
                i4 = ((i15 != 2048 || ((i14 & 4096) != 0 && composer3.changedInstance(callbacks))) ? i13 : z6 ? 1 : 0) | ((i14 & 896) != 256 ? i13 : z6 ? 1 : 0);
                objRememberedValue = composer3.rememberedValue();
                if (i4 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionKt.m2432xd63bcd6f(z, callbacks);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                AccountComparisonInfoBanner(null, (Function0) objRememberedValue, composer3, z6 ? 1 : 0, i13);
                composer3.endNode();
                composer3.endNode();
                composer3.startReplaceGroup(1758041401);
                if (scrollStateRememberScrollState.getMaxValue() != 0) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                }
                composer3.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i16 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme2.getSpacing(composer3, i16).m21592getMediumD9Ej5fM());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z6);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, z6 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup = composer3;
                BentoMarkdownText2.BentoMarkdownText(state.getDisclosure(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i16).getTextS(), 0, bentoTheme2.getColors(composer3, i16).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer3, i16).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), null, null, null, null, null, null, null, 0L, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1758062662);
                if (z4) {
                    boolean z7 = true;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, f2, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i16).m21592getMediumD9Ej5fM(), f2, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i16).m21592getMediumD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "maybe_later", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_maybe_later, composerStartRestartGroup, 0);
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i15 != 2048 && ((i14 & 4096) == 0 || !composerStartRestartGroup.changedInstance(callbacks))) {
                        z7 = false;
                    }
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z7 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new AccountSelectionKt$AccountSelectionScreen$1$3$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), strStringResource, modifierAutoLogEvents$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z5 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectionKt.AccountSelectionScreen$lambda$17(modifier3, state, z, callbacks, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z3 = z2;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy5, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default3 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default3, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i72).m21595getXsmallD9Ej5fM(), 5, null);
                    Modifier modifier52 = modifier4;
                    float f3 = 0.0f;
                    int i82 = i3;
                    BentoText2.m20747BentoText38GnDrw(state.getTitle(), modifierM5146paddingqDBjuR0$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                    composer2 = composerStartRestartGroup;
                    int i92 = 1;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default22 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer2, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default22);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        BentoMarkdownText2.BentoMarkdownText(state.getDescription_markdown(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                        composer2.endNode();
                        int i102 = 0;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, bentoTheme3.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                        MeasurePolicy measurePolicyColumnMeasurePolicy42 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composer2, i72).m21593getSmallD9Ej5fM()), companion6.getStart(), composer2, 0);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy42, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                            composer2.startReplaceGroup(1049872746);
                            while (r11.hasNext()) {
                            }
                            float f22 = f3;
                            composer3 = composer2;
                            int i132 = i92;
                            int i142 = i82;
                            boolean z62 = i102;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1633490746);
                            if ((i142 & 896) != 256) {
                            }
                            int i152 = i142 & 7168;
                            if (i152 != 2048) {
                                i4 = ((i152 != 2048 || ((i142 & 4096) != 0 && composer3.changedInstance(callbacks))) ? i132 : z62 ? 1 : 0) | ((i142 & 896) != 256 ? i132 : z62 ? 1 : 0);
                                objRememberedValue = composer3.rememberedValue();
                                if (i4 == 0) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AccountSelectionKt.m2432xd63bcd6f(z, callbacks);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                    composer3.endReplaceGroup();
                                    AccountComparisonInfoBanner(null, (Function0) objRememberedValue, composer3, z62 ? 1 : 0, i132);
                                    composer3.endNode();
                                    composer3.endNode();
                                    composer3.startReplaceGroup(1758041401);
                                    if (scrollStateRememberScrollState.getMaxValue() != 0) {
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                    int i162 = BentoTheme.$stable;
                                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme22.getSpacing(composer3, i162).m21592getMediumD9Ej5fM());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z62);
                                    currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, z62 ? 1 : 0);
                                    CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs2);
                                    ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor52 = companion52.getConstructor();
                                    if (composer3.getApplier() == null) {
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                    }
                                    composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion52.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash5 = companion52.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl5.getInserting()) {
                                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion52.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        composerStartRestartGroup = composer3;
                                        BentoMarkdownText2.BentoMarkdownText(state.getDisclosure(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme22.getTypography(composer3, i162).getTextS(), 0, bentoTheme22.getColors(composer3, i162).m21426getFg20d7_KjU(), bentoTheme22.getColors(composer3, i162).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), null, null, null, null, null, null, null, 0L, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.startReplaceGroup(1758062662);
                                        if (z4) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        z5 = z4;
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountSelectionScreen$lambda$16$lambda$13$lambda$12$lambda$11$lambda$10 */
    public static final Unit m2432xd63bcd6f(boolean z, AccountSelectionCallbacks accountSelectionCallbacks) {
        if (!z) {
            accountSelectionCallbacks.onAccountComparisonClicked();
        }
        return Unit.INSTANCE;
    }
}
